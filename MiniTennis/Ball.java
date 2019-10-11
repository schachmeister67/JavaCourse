package minitennis;

import java.awt.Graphics;

public class Ball {
	
	int x = 0;
	int y = 0;
	// xa and ya represent the speed in which the ball is moving
	int xa = 1;
	int ya = 1;
	private Game game;
	
	public Ball(Game game) {
		this.game = game;
	}
	
	public void move() {
		if (x + xa < 0)
			xa = 1; // move the ball to the right
		if (x + xa > game.getWidth() - 30)
			xa = -1; // move the ball to the left
		if (y + ya < 0)
			ya = 1; // move the ball down
		if (y + ya > game.getHeight() - 30)
			ya = -1; // move the ball up
		
		// change the direction of the ball
		x = x + xa;
		y = y + ya;
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, 30, 30);
	}

}
