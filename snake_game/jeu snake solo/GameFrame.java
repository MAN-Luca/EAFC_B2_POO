package Snake_Game;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	/**
	 * Construit la fenêtre 
	 */
	public GameFrame() {
		
		this.add(new GamePanel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); // centre la fenetre 
		
	}
}
