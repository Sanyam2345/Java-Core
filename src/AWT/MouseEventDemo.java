package AWT;
import java.awt.*;
import java.awt.event.*;

class MouseEventFrame extends Frame implements MouseListener, MouseMotionListener{
    Label l, l1;
    MouseEventFrame () {
    	super ("Mouse Event Demo");
		setLayout(null);
    	l = new Label("Nothing Happened");
    	l1 = new Label("");
    	l.setBounds(30, 40, 100, 20);
    	l1.setBounds(30, 70, 100, 20);
    	add(l);
    	add(l1);
    	addMouseListener(this);
    	addMouseMotionListener(this);
    	
    }
    public void mouseClicked(MouseEvent e) {
    		l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
    		l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
    		l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
    		l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
    		l.setText("Mouse Released");
    }
    public void mouseDragged(MouseEvent e) {
    		l.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent e) {
    		l.setText("Mouse Moved");
    		l1.setText("( " + e.getXOnScreen() + ", " + e.getYOnScreen() + " )");
    }
    
}

public class MouseEventDemo {
    public static void main(String[] args) {
    		MouseEventFrame f = new MouseEventFrame();
    		f.setSize(400, 400);
    		f.setVisible(true);
       }
}