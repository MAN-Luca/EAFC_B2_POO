package Snake_Game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener {
	// Constantes
	static final int SCREEN_WIDTH = 900;
	static final int SCREEN_HEIGHT = 900;
	static final int UNIT_SIZE = 50;
	static final int GAME_UNIT = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
	static final int DELAY = 100; // Vitesse jeu diminue avec DELAY augmente
	final int x[] = new int[GAME_UNIT];	// Position x des cases du snake (longueur max et le nombre de cases du jeu)
	final int y[] = new int[GAME_UNIT];	// Position y des cases du snake (longueur max et le nombre de cases du jeu)
	// Variables
	int bodyParts = 4;
	int applesEaten = 0;
	int appleX;
	int appleY;
	char direction = 'R'; // quand on commence le snake va vers la droite
	boolean running = false;
	Timer timer;
	Random random;
	// Bouton
	JButton restartButton;
	// Couleurs
	Color BG_COLOR = new Color(66, 66, 92);
	Color LINE_COLOR = new Color(95, 95, 129);
	Color APPLE_COLOR = new Color(216, 160, 253);
	Color HEAD_COLOR = new Color(56, 143, 229);
	Color BODY_COLOR = new Color(97, 176, 255);
	Color TEXT_COLOR = new Color(216, 160, 253);
	

	public GamePanel() {
        // Initialisation du jeu
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(BG_COLOR);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());

     // Configurer et ajouter le bouton Restart
        restartButton = new JButton("Restart");
        restartButton.setFocusable(false);
        restartButton.setFont(new Font("Hack", Font.BOLD, 20));

        // Personnalisation de la couleur de fond et du texte
        restartButton.setBackground(new Color(97, 176, 255));  // Couleur de fond du bouton
        restartButton.setForeground(new Color(66, 66, 92));    // Couleur du texte du bouton

        // Personnalisation de la bordure
        restartButton.setBorder(BorderFactory.createLineBorder(new Color(216, 160, 253), 2)); // Bordure de 2px de couleur

        // Position et affichage
        restartButton.setBounds((SCREEN_WIDTH / 2) - 75, (SCREEN_HEIGHT / 2) + 50, 150, 50);
        restartButton.setVisible(false);
        restartButton.addActionListener(e -> {
            resetGame();
            restartButton.setVisible(false);
        });

        this.setLayout(null);
        this.add(restartButton);

        // Initialisation du timer pour éviter le NullPointerException
        timer = new Timer(DELAY, this);	

        startGame();
    }

	

	public void startGame() {
        resetGame(); // Ajoute resetGame pour tout réinitialiser avant de démarrer
        newApple();
        running = true;
        timer.start();
        repaint();
    }

	
	public void resetGame() {
        bodyParts = 4;
        applesEaten = 0;
        direction = 'R';
        running = true;
        
        // Réinitialise les positions du serpent
        for (int i = 0; i < bodyParts; i++) {
            x[i] = 0;
            y[i] = 0;
        }
        
        newApple();
        timer.restart();
    }
	
	/**
	 * S'execute automatiquement 
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		if (running) {
			// Dessiner les lignes 
			g.setColor(LINE_COLOR);
			for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
				g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT); // Dessine les lignes
				g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE); // Dessines les colonnes
			}
			// Dessiner la pomme
			g.setColor(APPLE_COLOR);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
			// Dessiner le serpent
			for (int i = 0; i < bodyParts; i++) {
				if (i == 0) { // si c'est la tête du serpent
					g.setColor(HEAD_COLOR);
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				} else { // si c'est le corps du serpent
					g.setColor(BODY_COLOR);
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
			} 
			// Dessiner score
			g.setColor(TEXT_COLOR);
			g.setFont(new Font("Hack", Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: "+applesEaten)) / 2, g.getFont().getSize());
		} else {
			gameOver(g);
		}
	}
	/**
	 * Genere la position x et y de la pomme aléatoirement
	 */
	public void newApple() {
		do {
			appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
			appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
		} while (isAppleOnSnake(appleX, appleY));
	}
	
	// Return true si la nouvelle position de la pomme est sur le serpent sinon false
	private boolean isAppleOnSnake(int appleX, int appleY) {
		for (int i = 0; i < bodyParts; i++) {
			if (x[i] == appleX && y[i] == appleY) {
				return true;
			}
		}
		return false;
	}
	
	public void move() {
		// Parcours les parties du snake en sens inverse
		for (int i = bodyParts; i > 0; i--) {
			// On shift toutes les coordonnées des cases du corps du serpent
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		// On se deplace en fonction de up, down, left, right
		switch (direction) {
        case 'R' -> x[0] += UNIT_SIZE;
        case 'L' -> x[0] -= UNIT_SIZE;
        case 'U' -> y[0] -= UNIT_SIZE;
        case 'D' -> y[0] += UNIT_SIZE;
    }
	}
	
	public void checkApple() {
		if ((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts++;
			applesEaten++;
			newApple();
		}
	}
	
	public void checkCollisions() {
	    // Vérifie si la tête entre en contact avec le corps du serpent
	    for (int i = bodyParts; i > 0; i--) {
	        if ((x[0] == x[i]) && (y[0] == y[i])) { // Coordonnées de la tête égales à celles d'une partie du corps
	            running = false;
	        }
	    }
	    // Vérifie si la tête touche une des bordures
	    if (x[0] < 0 || x[0] >= SCREEN_WIDTH || y[0] < 0 || y[0] >= SCREEN_HEIGHT) {
	        running = false;
	    }
	    // Si le jeu ne fonctionne plus, on arrête le timer
	    if (!running) {
	        timer.stop();
	        restartButton.setVisible(true); // Affiche le bouton quand le jeu est terminé
	    }
	}

	
	public void gameOver(Graphics g) {
		// Texte GameOver
		g.setColor(TEXT_COLOR);
		g.setFont(new Font("Hack", Font.BOLD, 75));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("GAME OVER", (SCREEN_WIDTH - metrics1.stringWidth("GAME OVER")) / 2, SCREEN_HEIGHT / 2);
		// Texte score
		g.setColor(TEXT_COLOR);
		g.setFont(new Font("Hack", Font.BOLD, 40));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics2.stringWidth("Score: "+applesEaten)) / 2, g.getFont().getSize());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint(); // si le jeu n'est plus running on repaint(reset)
	}
	
	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (direction != 'R') direction = 'L';
				break;
			case KeyEvent.VK_RIGHT:
				if (direction != 'L') direction = 'R';
				break;
			case KeyEvent.VK_UP:
				if (direction != 'D') direction = 'U';
				break;
			case KeyEvent.VK_DOWN:
				if (direction != 'U') direction = 'D';
				break;
			}
		}
	}
	
}
