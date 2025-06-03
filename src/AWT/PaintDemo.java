package AWT;
import java.awt.*;
import java.awt.event.*;

class PaintFrame extends Frame {
	int x = 0, y = 0;
	PaintFrame() {
		super ("paint");
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				x = e.getXOnScreen();
				y = e.getYOnScreen();
				repaint();
			}
			public void mouseDragged(MouseEvent e) {
				x = e.getXOnScreen();
				y = e.getYOnScreen();
				repaint();
			}
		});
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.setFont(new Font("Times New Roman",Font.BOLD, 33));
		g.drawString("Hello",x,y);
	}
}

public class PaintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PaintFrame f = new PaintFrame();
			f.setSize(500,500);
			f.setVisible(true);
	}

}
