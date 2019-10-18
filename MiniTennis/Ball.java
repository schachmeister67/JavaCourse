package minitennis8;

import java.awt.Graphics;
import java.awt.Rectangle;

// Adding speed handling
public class Ball {
	private static final int DIAMETER = 30;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private Game game;
	
	public Ball(Game game) {
		this.game = game;
	}
	
	public void move() {
		if (x + xa < 0)
			xa = game.speed; // update
		if (x + xa > game.getWidth() - DIAMETER)
			xa = -game.speed; // update
		if (y + ya < 0)
			ya = game.speed; // update
		if (y + ya > game.getHeight() - DIAMETER)
			game.gameOver();
		if (collision()) {
			ya = -game.speed; // update
			y = game.racquet.getTopY() - DIAMETER;
			game.speed++; // new
		}
		
		x = x + xa;
		y = y + ya;
	}
	
	private boolean collision() {
		return game.racquet.getBounds().intersects(getBounds());
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, 30, 30);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}

}
