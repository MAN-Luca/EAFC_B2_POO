package snake_game.projetEAFC;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class LeaderboardPanel extends JPanel {
    private final JFrame parentFrame;
    private final DatabaseManager dbManager;
    private final JComboBox<String> userFilterBox;
    private final String currentUsername;
    private JTable leaderboardTable;
    private final String[] columnNames = {"", "User", "Score", "Date"};

    public LeaderboardPanel(JFrame parentFrame, String currentUsername) {
        this.parentFrame = parentFrame;
        this.currentUsername = currentUsername;
        this.dbManager = new DatabaseManager();

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 800));
        setBackground(new Color(34, 40, 49));

        // Title
        JLabel title = new JLabel("Leaderboard", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 48));
        title.setForeground(Color.WHITE);
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        // Filter Panel
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.setBackground(new Color(34, 40, 49));

        JLabel filterLabel = new JLabel("Filter by user:");
        filterLabel.setForeground(Color.WHITE);
        filterLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        topPanel.add(filterLabel);

        userFilterBox = new JComboBox<>();
        userFilterBox.setFont(new Font("Arial", Font.PLAIN, 16));
        userFilterBox.addItem("All users");

        for (String username : dbManager.getAllUsernames()) {
            userFilterBox.addItem(username);
        }

        userFilterBox.addActionListener(e -> updateLeaderboard());
        topPanel.add(userFilterBox);
        add(topPanel, BorderLayout.BEFORE_FIRST_LINE);

        // Table
        leaderboardTable = new JTable();
        leaderboardTable.setFont(new Font("Monospaced", Font.PLAIN, 18));
        leaderboardTable.setRowHeight(30);
        leaderboardTable.setEnabled(false);
        leaderboardTable.setBackground(new Color(44, 50, 59));
        leaderboardTable.setForeground(Color.WHITE);
        leaderboardTable.setGridColor(Color.DARK_GRAY);

        JScrollPane scrollPane = new JScrollPane(leaderboardTable);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40));
        add(scrollPane, BorderLayout.CENTER);

        // Back button
        JButton backButton = new JButton("Back to Menu");
        backButton.setFont(new Font("Arial", Font.BOLD, 24));
        backButton.setBackground(new Color(0, 173, 181));
        backButton.setForeground(Color.WHITE);
        backButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setFocusPainted(false);
        backButton.setPreferredSize(new Dimension(200, 50));
        backButton.addActionListener(e -> {
            parentFrame.setContentPane(new MainMenu(parentFrame, currentUsername));
            parentFrame.revalidate();
            parentFrame.pack();
            parentFrame.repaint();
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(34, 40, 49));
        bottomPanel.add(backButton);
        add(bottomPanel, BorderLayout.SOUTH);

        updateLeaderboard();
    }

    private void updateLeaderboard() {
        String selectedUser = (String) userFilterBox.getSelectedItem();
        List<String> allScores = dbManager.getAllScores();
        List<String> podium = allScores.stream().limit(3).collect(Collectors.toList());

        List<String> filtered = allScores;
        if (selectedUser != null && !selectedUser.equals("All users")) {
            filtered = filtered.stream()
                    .filter(s -> s.toLowerCase().startsWith(selectedUser.toLowerCase() + " - "))
                    .collect(Collectors.toList());
        }

        Object[][] rowData = new Object[filtered.size()][4];
        for (int i = 0; i < filtered.size(); i++) {
            String line = filtered.get(i);
            String[] parts = line.split(" - ");
            if (parts.length != 3) continue;

            String user = parts[0];
            String score = parts[1].replace(" pts", "").trim();
            String date = parts[2];

            String emoji = switch (podium.indexOf(line)) {
                case 0 -> "🥇"; // 🥇
                case 1 -> "🥈"; // 🥈
                case 2 -> "🥉"; // 🥉
                default -> "";
            };

            rowData[i][0] = emoji;
            rowData[i][1] = user;
            rowData[i][2] = score;
            rowData[i][3] = date;
        }

        leaderboardTable.setModel(new DefaultTableModel(rowData, columnNames));
    }
}
