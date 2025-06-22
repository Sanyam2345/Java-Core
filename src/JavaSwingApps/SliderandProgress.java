package JavaSwingApps;
import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.*;
import javax.swing.event.*;

class SliderFrame extends JFrame implements ChangeListener{
	JSlider js;
	JProgressBar jp;
	JPanel p1, p2;
	int w = 50;
	SliderFrame () {
		super ("Slider and Progress Bar");
		js = new JSlider(0,100,50);
		js.setMajorTickSpacing(10);
		js.setMinorTickSpacing(1);
		js.setPaintLabels(true);
		js.setPaintTicks(true);
		
		jp = new JProgressBar();
		jp.setString("50%");
		jp.setStringPainted(true);
		p1 = new JPanel();
		p1.add(jp);
		
		p2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawOval(200, 200, w, w);
			}
		};
		
		add(js, BorderLayout.NORTH);
		add(p1, BorderLayout.SOUTH);
		add(p2, BorderLayout.CENTER);
		js.addChangeListener(this);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		w = js.getValue();
		p2.repaint();
		jp.setString(w + "%");
		jp.setStringPainted(true);
		jp.setValue(w);
	}
}

public class SliderandProgress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SliderFrame sf = new SliderFrame();
		sf.setSize(500,500);
		sf.setVisible(true);
		sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
