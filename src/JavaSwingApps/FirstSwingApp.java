package JavaSwingApps;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class FirstSwingFrame extends JFrame implements ActionListener{
	JLabel l;
	JButton b,b1;
	int count = 0;
	FirstSwingFrame () {
		super ("First Swing Application");
		setLayout(new FlowLayout());
		l = new JLabel("" + count);
		b = new JButton("Click");
		b1 = new JButton("Cancel");
		add(l);
		add(b);
		add(b1);
		getRootPane().setDefaultButton(b);
		b.addActionListener(e -> {count++;l.setText("" + count);});
		b1.addActionListener(e -> System.exit(0));
		
	}
}

public class FirstSwingApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstSwingFrame f = new FirstSwingFrame();
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
