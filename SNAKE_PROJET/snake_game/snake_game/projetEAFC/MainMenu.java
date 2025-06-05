package snake_game.projetEAFC;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.Period;


public class MainMenu extends JPanel {
    private JFrame parentFrame;
    private JComboBox<String> userDropdown;
    private JTextField newUserField;
    private DatabaseManager dbManager;
    private String currentUsername;

    private static final Color COLOR_BG_MAIN_MENU = new Color(34, 40, 49);
    private static final Color COLOR_BG_BUTTON = new Color(0, 173, 181);
    private static final Color COLOR_BG_HOVER = new Color(0, 145, 150);
    private static final Color COLOR_TEXT = Color.WHITE;

    private static final Font TITLE_FONT = new Font("Arial", Font.BOLD, 72);
    private static final Font BUTTON_FONT = new Font("Arial", Font.BOLD, 28);
    private static final Font FOOTER_FONT = new Font("Arial", Font.PLAIN, 16);

    public MainMenu(JFrame parentFrame, String selectedUser) {
        this.parentFrame = parentFrame;
        this.setPreferredSize(new Dimension(800, 800));
        this.setLayout(new BorderLayout());
        this.setBackground(COLOR_BG_MAIN_MENU);
        dbManager = new DatabaseManager();

        // --- Title ---
        JLabel titleLabel = new JLabel("SNAKE GAME", SwingConstants.CENTER);
        titleLabel.setFont(TITLE_FONT);
        titleLabel.setForeground(COLOR_TEXT);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(40, 0, 0, 0));
        this.add(titleLabel, BorderLayout.NORTH);

        // --- Center Panel with Snake Preview and Content ---
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(COLOR_BG_MAIN_MENU);

        // --- Snake Preview Panel ---
        JPanel snakePreviewPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int unitSize = 40;
                int segments = 4;
                int totalWidth = unitSize * segments;
                int startX = (getWidth() - totalWidth) / 2;
                int startY = 40;

                Color headColor = new Color(0, 200, 83);
                Color bodyColor = new Color(0, 150, 60);
                Color appleColor = new Color(255, 85, 85);

                // Draw body (left to right)
                g2.setColor(bodyColor);
                for (int i = 0; i < segments - 1; i++) {
                    g2.fillRoundRect(startX + i * unitSize, startY, unitSize, unitSize, 10, 10);
                }

                // Draw head (right end)
                int headX = startX + (segments - 1) * unitSize;
                g2.setColor(headColor);
                g2.fillRoundRect(headX, startY, unitSize, unitSize, 10, 10);

                // Eyes on the right side (facing right)
                g2.setColor(Color.WHITE);
                g2.fillOval(headX + unitSize - 18, startY + 8, 10, 10);
                g2.fillOval(headX + unitSize - 18, startY + unitSize - 18, 10, 10);

                g2.setColor(Color.BLACK);
                g2.fillOval(headX + unitSize - 15, startY + 11, 5, 5);
                g2.fillOval(headX + unitSize - 15, startY + unitSize - 15, 5, 5);

                // Apple (in front of head)
                g2.setColor(appleColor);
                g2.fillOval(headX + unitSize + 20, startY + 5, unitSize, unitSize);
            }
        };
        snakePreviewPanel.setPreferredSize(new Dimension(800, 100));
        snakePreviewPanel.setBackground(COLOR_BG_MAIN_MENU);
        centerPanel.add(snakePreviewPanel);

        // --- User + Button Content ---
        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(COLOR_BG_MAIN_MENU);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 40, 10, 40);

        // User Panel
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridLayout(4, 1, 10, 10));
        userPanel.setBackground(COLOR_BG_MAIN_MENU);

        JLabel selectLabel = new JLabel("Select existing user:");
        selectLabel.setForeground(COLOR_TEXT);
        userPanel.add(selectLabel);

        userDropdown = new JComboBox<>();
        for (String username : dbManager.getAllUsernames()) {
            userDropdown.addItem(username);
        }

        if (selectedUser != null) {
            userDropdown.setSelectedItem(selectedUser);
        }

        userPanel.add(userDropdown);

        JLabel createLabel = new JLabel("Or create new user:");
        createLabel.setForeground(COLOR_TEXT);
        userPanel.add(createLabel);

        newUserField = new JTextField();
        userPanel.add(newUserField);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        contentPanel.add(userPanel, gbc);

        // Button Panel
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 20, 20));
        buttonPanel.setBackground(COLOR_BG_MAIN_MENU);

        JButton playButton = createStyledButton("Play");
        JButton leaderboardButton = createStyledButton("Leaderboard");
        JButton helpButton = createStyledButton("Help");
        JButton quitButton = createStyledButton("Quit");

        buttonPanel.add(playButton);
        buttonPanel.add(leaderboardButton);
        buttonPanel.add(helpButton);
        buttonPanel.add(quitButton);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        contentPanel.add(buttonPanel, gbc);

        centerPanel.add(contentPanel);
        this.add(centerPanel, BorderLayout.CENTER);

        // --- Footer ---
        JLabel footerLabel = new JLabel("POOAPT_O1J_2425 : Thomas Vrydagh - Mossaab Sedjari - Luca Mansutti", SwingConstants.CENTER);
        footerLabel.setFont(FOOTER_FONT);
        footerLabel.setForeground(COLOR_TEXT);
        footerLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        this.add(footerLabel, BorderLayout.SOUTH);

        // --- Actions ---
        playButton.addActionListener(e -> startGame());
        helpButton.addActionListener(e -> showHelpPage());
        leaderboardButton.addActionListener(e -> showLeaderboard());
        quitButton.addActionListener(e -> System.exit(0));
    }

    private void startGame() {
        String username = newUserField.getText().trim();

        // Si aucun nouveau nom entré, prendre la sélection
        if (username == null || username.isBlank()) {
            username = (String) userDropdown.getSelectedItem();
        }

        // Validation
        if (username == null || username.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please select or enter a username.", "Missing User", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Vider le champ après validation
        newUserField.setText("");

        currentUsername = username;

        // 🔍 Vérifie si c'est un nouvel utilisateur
        boolean isNewUser = true;
        for (int i = 0; i < userDropdown.getItemCount(); i++) {
            if (userDropdown.getItemAt(i).equalsIgnoreCase(username)) {
                isNewUser = false;
                break;
            }
        }

        // 🗓️ Si c'est un nouveau, demande la date de naissance
        if (isNewUser) {
            String birthdateStr = JOptionPane.showInputDialog(this, "Enter your birthdate (YYYY-MM-DD):");
            if (birthdateStr == null || birthdateStr.isBlank()) return;

            try {
                LocalDate birthdate = LocalDate.parse(birthdateStr);
                int age = Period.between(birthdate, LocalDate.now()).getYears();
                if (age < 8) {
                    JOptionPane.showMessageDialog(this, "You must be at least 8 years old to play.", "Age Restriction", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid date format. Please enter as YYYY-MM-DD.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int userId = dbManager.getOrCreateUserId(username);
        if (userId == -1) {
            JOptionPane.showMessageDialog(this, "Could not create or find user.", "Database Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        parentFrame.setContentPane(new GamePanel(parentFrame, userId, username));
        parentFrame.revalidate();
        parentFrame.pack();
        parentFrame.repaint();
        parentFrame.getContentPane().requestFocusInWindow();
    }



    private void showLeaderboard() {
        if (currentUsername == null) {
            String username = newUserField.getText().trim();
            if (username.isEmpty()) {
                username = (String) userDropdown.getSelectedItem();
            }
            currentUsername = username;
        }

        parentFrame.setContentPane(new LeaderboardPanel(parentFrame, currentUsername));
        parentFrame.revalidate();
        parentFrame.pack();
        parentFrame.repaint();
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(BUTTON_FONT);
        button.setBackground(COLOR_BG_BUTTON);
        button.setForeground(COLOR_TEXT);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
        button.setPreferredSize(new Dimension(240, 60));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(COLOR_BG_HOVER);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(COLOR_BG_BUTTON);
            }
        });
        return button;
    }

    private void showHelpPage() {
        JOptionPane.showMessageDialog(this,
                "Use the arrow keys to control the snake.\nEat apples to grow and score points.\nDon't crash into walls or yourself!",
                "Help",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
