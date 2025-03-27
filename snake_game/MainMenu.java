package snake_game;

import javax.swing.*;
import java.awt.*;

/* 
 * Cette classe contient le menu principal
 */
public class MainMenu extends JPanel {
    private JFrame parentFrame; // Fenêtre principale

    // CONSTANTES
    private static final Color COLOR_BG_MAIN_MENU = new Color(26, 28, 33);
    private static final Color COLOR_BG_BUTTONS_CLASSIC = new Color(80, 130, 255); // Bleu plus foncé
    private static final Color COLOR_BG_BUTTONS_HOVER = new Color(122, 157, 245); // Bleu clair

    private static final Font TITLE_FONT = new Font("Arial", Font.BOLD, 96);
    private static final Font BUTTON_FONT = new Font("Arial", Font.BOLD, 36);
    private static final Font FOOTER_FONT = new Font("Arial", Font.PLAIN, 18); // Police pour le texte du bas

    private JTextField usernameField; // Champ pour entrer le nom d'utilisateur

    public MainMenu(JFrame parentFrame) {
        this.parentFrame = parentFrame;

        // Configuration du panneau principal
        this.setLayout(new BorderLayout());
        this.setBackground(COLOR_BG_MAIN_MENU);

        // Création du titre
        JLabel titleLabel = new JLabel("SNAKE GAME", SwingConstants.CENTER);
        titleLabel.setFont(TITLE_FONT);
        titleLabel.setForeground(Color.WHITE);

        // Ajout du titre avec un espace au-dessus
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBackground(COLOR_BG_MAIN_MENU);
        titlePanel.add(titleLabel, BorderLayout.CENTER);
        titlePanel.setPreferredSize(new Dimension(800, 300)); // Ajuste la hauteur du titre

        // Ajouter un espace en haut du panneau titre
        titlePanel.setBorder(BorderFactory.createEmptyBorder(200, 0, 0, 0)); // Marge de 50px en haut

        // Création des boutons 
        JButton playButton = createStyledButton("Play");
        JButton helpButton = createStyledButton("Help");
        JButton exitButton = createStyledButton("Quit");

        // Création du champ de texte pour le nom d'utilisateur
        JLabel usernameLabel = new JLabel("Enter your username:", SwingConstants.CENTER);
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        usernameLabel.setForeground(Color.WHITE);
        
        usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(200, 30)); // Taille du champ de texte
        usernameField.setFont(new Font("Arial", Font.PLAIN, 20));

        // Création du panneau pour le champ de texte et le label
        JPanel usernamePanel = new JPanel();
        usernamePanel.setOpaque(false); // Fond transparent
        usernamePanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 0, 10, 0); // Espacement entre les éléments

        usernamePanel.add(usernameLabel, gbc);
        gbc.gridy++;
        usernamePanel.add(usernameField, gbc);

        // Ajout du titre au panel principal
        this.add(titlePanel, BorderLayout.NORTH);

        // Ajout des éléments du menu (champ texte et boutons)
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setOpaque(false); // Fond transparent

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Espacement entre les boutons
        gbc.fill = GridBagConstraints.NONE;

        buttonPanel.add(usernamePanel, gbc); // Ajouter le panneau username
        gbc.gridy++;
        buttonPanel.add(playButton, gbc);
        gbc.gridy++;
        buttonPanel.add(helpButton, gbc);
        gbc.gridy++;
        buttonPanel.add(exitButton, gbc);

        // Ajout des boutons
        this.add(buttonPanel, BorderLayout.CENTER);

        // Ajouter un texte en bas
        JLabel footerLabel = new JLabel("POOAPT_O1J_2425 : Thomas Vrydagh - Mossaab Sedjari - Luca Mansutti ", SwingConstants.CENTER);
        footerLabel.setFont(FOOTER_FONT);
        footerLabel.setForeground(Color.WHITE);
        
        // Ajout du texte en bas
        this.add(footerLabel, BorderLayout.SOUTH);

        // Actions des boutons
        playButton.addActionListener(e -> startGame());
        helpButton.addActionListener(e -> showHelpPage());
        exitButton.addActionListener(e -> System.exit(0));
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(BUTTON_FONT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setBackground(COLOR_BG_BUTTONS_CLASSIC); 
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setPreferredSize(new Dimension(200, 75));

        // Effet hover
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(COLOR_BG_BUTTONS_HOVER);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(COLOR_BG_BUTTONS_CLASSIC); 
            }
        });

        return button;
    }

    private void startGame() {
        String username = usernameField.getText(); // Récupérer le texte entré
        if (username.isBlank()) {
        	username = "default_user";
        }
        System.out.println("Username: " + username); // Afficher le nom d'utilisateur dans la console (peut être utilisé pour le jeu)
        
        this.parentFrame.setContentPane(new JPanel());
        this.parentFrame.revalidate();
    }

    private void showHelpPage() {
        this.parentFrame.setContentPane(new JPanel());
        this.parentFrame.revalidate();
    }
}
