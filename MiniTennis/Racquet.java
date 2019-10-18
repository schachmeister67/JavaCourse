package minitennis;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet {
	// Add constants
	private static final int Y = 330;
	private static final int WIDTH = 60;
	private static final int HEIGHT = 10;
	
	int x = 0;
	int xa = 0;
	private Game game;
	
	public Racquet(Game game) {
		this.game = game;
	}
	
	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-WIDTH)
			x = x + xa;
	}
	
	public void paint(Graphics2D g) {
		g.fillRect(x, 330, WIDTH, HEIGHT);
	}
	
	public void keyReleased(KeyEvent e) {
		xa = 0;
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
	}
	
	// Add Rectangle method
	public Rectangle getBounds() {
		return new Rectangle(x, Y, WIDTH, HEIGHT);
	}
	
	// Add method to assist in collision detection
	public int getTopY() {
		return Y;
	}

}
