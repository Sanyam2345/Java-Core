package JavaSwingApps;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

class JavaLayeredFrame extends JFrame implements ActionListener{
	JLabel l1, l2, l3, l4;
	JLayeredPane lp;
	JRadioButton r1, r2, r3;
	
	@SuppressWarnings("removal")
	
	JavaLayeredFrame () {
		super ("Java Layered Pane");
		
		l1 = new JLabel("red");
		l1.setBounds(10,10,200,200);
		l1.setBackground(Color.red);
		l1.setOpaque(true);
		
		l2 = new JLabel("blue");
		l2.setBounds(50,50,300,300);
		l2.setBackground(Color.blue);
		l2.setOpaque(true);
		
		l3 = new JLabel("green");
		l3.setBounds(100,100,400,400);
		l3.setBackground(Color.green);
		l3.setOpaque(true);
		
		l4 = new JLabel("black");
		l4.setBounds(10,10,100,100);
		l4.setBackground(Color.black);
		l4.setOpaque(true);
		
		lp = new JLayeredPane();
		lp.add(l1, new Integer(0));
		lp.add(l2, new Integer(1));
		lp.add(l3, new Integer(2));
		lp.add(l4, new Integer(2));
		
		JPanel p = new JPanel();
		r1 = new JRadioButton("red");
		r2 = new JRadioButton ("blue",true);
		r3 = new JRadioButton("green");
		p.add(r1);
		p.add(r2);
		p.add(r3);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		add(lp, BorderLayout.CENTER);
		add(p, BorderLayout.NORTH);
		
		addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent me) {
				l4.setLocation(me.getX(),me.getY());
			}
		});
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if(r1.isSelected())
			lp.setLayer(l4, new Integer(1));
		if(r2.isSelected())
			lp.setLayer(l4, new Integer(2));
		if(r3.isSelected())
			lp.setLayer(l4, new Integer(3));
	}
}

public class JavaLayeredPane {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaLayeredFrame f = new JavaLayeredFrame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
