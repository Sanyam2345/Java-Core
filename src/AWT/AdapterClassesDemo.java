/**
 * @author SANYAM
 */
package AWT;
import java.awt.*;
import java.awt.event.*;

class AdapterClassesFrame extends Frame {
	Label l;
	AdapterClassesFrame () {
		super ("Adapeter Classes");
		l = new Label("                         ");
		setLayout(new FlowLayout());
		add(l);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				l.setText("Closing");
				System.exit(0);
			}
		}); 
	}
}

public class AdapterClassesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdapterClassesFrame f = new AdapterClassesFrame();
		f.setSize(500,500);
		f.setVisible(true);
	}

}
