package snake_game.projetEAFC;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener {
	private JFrame parentFrame;

	private int userId;
	private String username;
	private DatabaseManager dbManager;

	static final int SCREEN_WIDTH = 800;
	static final int SCREEN_HEIGHT = 800;
	static final int UNIT_SIZE = 50;
	static final int GAME_UNIT = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
	static final int DELAY = 100;

	final int[] x = new int[GAME_UNIT];
	final int[] y = new int[GAME_UNIT];

	private boolean scoreSaved = false;

	int bodyParts = 4;
	int applesEaten = 0;
	int appleX, appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;

	JButton restartButton;
	JButton backToMenuButton;

	// Eye blinking variables
	boolean isBlinking = false;
	int blinkTimer = 0;
	int blinkCooldown = 0;

	Color BG_COLOR = new Color(34, 40, 49);
	Color LINE_COLOR = new Color(58, 71, 80);
	Color APPLE_COLOR = new Color(255, 85, 85);
	Color HEAD_COLOR = new Color(0, 200, 83);
	Color BODY_COLOR = new Color(0, 150, 60);
	Color TEXT_COLOR = new Color(238, 238, 238);

	public GamePanel(JFrame parentFrame) {
		this.parentFrame = parentFrame;
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(BG_COLOR);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		this.setLayout(null);

		restartButton = createButton("Restart", SCREEN_HEIGHT / 2 + 50);
		restartButton.addActionListener(e -> {
			resetGame();
			restartButton.setVisible(false);
			backToMenuButton.setVisible(false);
		});
		this.add(restartButton);

		backToMenuButton = createButton("Menu", SCREEN_HEIGHT / 2 + 120);
		backToMenuButton.addActionListener(e -> {
			parentFrame.setContentPane(new MainMenu(parentFrame, username));
			parentFrame.revalidate();
			parentFrame.pack();
			parentFrame.repaint();
			parentFrame.getContentPane().requestFocusInWindow();
		});
		this.add(backToMenuButton);

		timer = new Timer(DELAY, this);

		this.dbManager = new DatabaseManager();
		startGame();
	}

	public GamePanel(JFrame parentFrame, int userId, String username) {
		this(parentFrame); // call the original constructor
		this.userId = userId;
		this.username = username;
	}


	private JButton createButton(String text, int yPosition) {
		JButton button = new JButton(text);
		button.setFocusable(false);
		button.setFont(new Font("Arial", Font.BOLD, 18));
		button.setBackground(new Color(0, 173, 181));
		button.setForeground(Color.WHITE);
		button.setBorder(BorderFactory.createEmptyBorder());
		button.setBounds((SCREEN_WIDTH / 2) - 100, yPosition, 200, 50);
		button.setVisible(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
		return button;
	}

	public void startGame() {
		resetGame();
		newApple();
		running = true;
		timer.start();
		repaint();
	}

	public void resetGame() {
		scoreSaved = false;

		bodyParts = 4;
		applesEaten = 0;
		direction = 'R';
		running = true;
		for (int i = 0; i < bodyParts; i++) {
			x[i] = 0;
			y[i] = 0;
		}
		newApple();
		timer.restart();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {
		if (running) {
			g.setColor(LINE_COLOR);
			for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
				g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
				g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
			}

			g.setColor(APPLE_COLOR);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

			for (int i = 0; i < bodyParts; i++) {
				if (i == 0) {
					g.setColor(HEAD_COLOR);
					g.fillRoundRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE, 10, 10);

					Color eyeColor = isBlinking ? BODY_COLOR : Color.WHITE;
					Color pupilColor = isBlinking ? BODY_COLOR : Color.BLACK;
					g.setColor(eyeColor);
					int eyeSize = 13;
					int pupilSize = 5;

					switch (direction) {
						case 'U' -> {
							g.fillOval(x[i] + 10, y[i] + 5, eyeSize, eyeSize);
							g.fillOval(x[i] + UNIT_SIZE - 20, y[i] + 5, eyeSize, eyeSize);
							g.setColor(pupilColor);
							g.fillOval(x[i] + 12, y[i] + 7, pupilSize, pupilSize);
							g.fillOval(x[i] + UNIT_SIZE - 18, y[i] + 7, pupilSize, pupilSize);
						}
						case 'D' -> {
							g.fillOval(x[i] + 10, y[i] + UNIT_SIZE - 15, eyeSize, eyeSize);
							g.fillOval(x[i] + UNIT_SIZE - 20, y[i] + UNIT_SIZE - 15, eyeSize, eyeSize);
							g.setColor(pupilColor);
							g.fillOval(x[i] + 12, y[i] + UNIT_SIZE - 13, pupilSize, pupilSize);
							g.fillOval(x[i] + UNIT_SIZE - 18, y[i] + UNIT_SIZE - 13, pupilSize, pupilSize);
						}
						case 'L' -> {
							g.fillOval(x[i] + 5, y[i] + 10, eyeSize, eyeSize);
							g.fillOval(x[i] + 5, y[i] + UNIT_SIZE - 20, eyeSize, eyeSize);
							g.setColor(pupilColor);
							g.fillOval(x[i] + 7, y[i] + 12, pupilSize, pupilSize);
							g.fillOval(x[i] + 7, y[i] + UNIT_SIZE - 18, pupilSize, pupilSize);
						}
						case 'R' -> {
							g.fillOval(x[i] + UNIT_SIZE - 15, y[i] + 10, eyeSize, eyeSize);
							g.fillOval(x[i] + UNIT_SIZE - 15, y[i] + UNIT_SIZE - 20, eyeSize, eyeSize);
							g.setColor(pupilColor);
							g.fillOval(x[i] + UNIT_SIZE - 13, y[i] + 12, pupilSize, pupilSize);
							g.fillOval(x[i] + UNIT_SIZE - 13, y[i] + UNIT_SIZE - 18, pupilSize, pupilSize);
						}
					}
				} else {
					g.setColor(BODY_COLOR);
					g.fillRoundRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE, 10, 10);
				}
			}

			g.setColor(TEXT_COLOR);
			g.setFont(new Font("Arial", Font.BOLD, 36));
			String scoreText = "Score: " + applesEaten;
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString(scoreText, (SCREEN_WIDTH - metrics.stringWidth(scoreText)) / 2, 40);
		} else {
			gameOver(g);
		}
	}

	public void newApple() {
		do {
			appleX = random.nextInt(SCREEN_WIDTH / UNIT_SIZE) * UNIT_SIZE;
			appleY = random.nextInt(SCREEN_HEIGHT / UNIT_SIZE) * UNIT_SIZE;
		} while (isAppleOnSnake(appleX, appleY));
	}

	private boolean isAppleOnSnake(int appleX, int appleY) {
		for (int i = 0; i < bodyParts; i++) {
			if (x[i] == appleX && y[i] == appleY) return true;
		}
		return false;
	}

	public void move() {
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
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
		for (int i = bodyParts; i > 0; i--) {
			if ((x[0] == x[i]) && (y[0] == y[i])) running = false;
		}
		if (x[0] < 0 || x[0] >= SCREEN_WIDTH || y[0] < 0 || y[0] >= SCREEN_HEIGHT) running = false;

		if (!running) {
			timer.stop();
			restartButton.setVisible(true);
			backToMenuButton.setVisible(true);

			if (!scoreSaved && dbManager != null && userId > 0) {
				dbManager.insertScore(userId, applesEaten);
				scoreSaved = true;
			}
		}


	}

	public void gameOver(Graphics g) {
		g.setColor(TEXT_COLOR);
		g.setFont(new Font("Arial", Font.BOLD, 72));
		String gameOverText = "GAME OVER";
		FontMetrics metrics = getFontMetrics(g.getFont());
		g.drawString(gameOverText, (SCREEN_WIDTH - metrics.stringWidth(gameOverText)) / 2, SCREEN_HEIGHT / 2);

		g.setFont(new Font("Arial", Font.BOLD, 32));
		String scoreText = "Score: " + applesEaten;
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString(scoreText, (SCREEN_WIDTH - metrics2.stringWidth(scoreText)) / 2, SCREEN_HEIGHT / 2 + 35);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			checkApple();
			checkCollisions();
		}

		if (blinkCooldown <= 0 && Math.random() < 0.01) {
			isBlinking = true;
			blinkTimer = 4;
			blinkCooldown = 25;
		}

		if (blinkTimer > 0) {
			blinkTimer--;
			if (blinkTimer == 0) isBlinking = false;
		} else {
			blinkCooldown--;
		}

		repaint();
	}

	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT -> { if (direction != 'R') direction = 'L'; }
				case KeyEvent.VK_RIGHT -> { if (direction != 'L') direction = 'R'; }
				case KeyEvent.VK_UP -> { if (direction != 'D') direction = 'U'; }
				case KeyEvent.VK_DOWN -> { if (direction != 'U') direction = 'D'; }
			}
		}
	}
}
