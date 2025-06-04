package AWT;

import java.awt.*;
import java.awt.event.*;

class AnimationFrame extends Frame implements Runnable {
	int x, y, tx, ty;

	AnimationFrame() {
		super("Bouncing ball");
		x = 100;
		y = 100;
		tx = ty = 1;
		Thread t = new Thread(this);
		t.start();
	}

	public void paint(Graphics g) {
		g.fillOval(x, y, 50, 50);
	}

	public void run() {
		while (true) {
			x += tx;
			y += ty;

			if (x < 35 || x > 450)
				tx = tx * (-1);
			if (y < 20 || y > 400)
				ty = ty * (-1);
			try {
				Thread.sleep(5);
			} catch (Exception _) {
			}
			repaint();
		}
	}
}


public class AnimationDemo {
	public static void main(String[] args) {
		AnimationFrame f = new AnimationFrame();
		f.setSize(500, 450);
		f.setVisible(true);
	}
}
