package JavaSwingApps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTextBoxRadioButtonFrame extends JFrame implements ActionListener{
	JTextField tf;
	JCheckBox bold, italic;
	JRadioButton upper, lower;
	ButtonGroup bg;
	JTextBoxRadioButtonFrame () {
		super ("CheckBox Demo");
		tf = new JTextField("Demo Text", 20);
		bold = new JCheckBox("Bold");
		bold.setMnemonic(KeyEvent.VK_B);
		italic = new JCheckBox("Italic");
		italic.setMnemonic(KeyEvent.VK_I);
		lower = new JRadioButton("lower", false);
		upper = new JRadioButton("UPPER",false);
		bg = new ButtonGroup();
		setLayout(new FlowLayout());
		add(tf);
		add(bold);
		add(italic);
		bg.add(lower);
		bg.add(upper);
		bold.addActionListener(this);
		italic.addActionListener(this);
		upper.addActionListener(this);
		lower.addActionListener(this);
		
		upper.setActionCommand("upper");
		lower.setActionCommand("lower");
		
		add(upper);
		add(lower);
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "upper": tf.setText(tf.getText().toUpperCase());
						break;
		case "lower": tf.setText(tf.getText().toLowerCase()); break;
		}
		int b=0,i=0;
		if(bold.isSelected())
			b = Font.BOLD;
		if(italic.isSelected())
			i = Font.ITALIC;
		
		Font f = new Font("Times New Roman", b|i, 15);
		tf.setFont(f);
	}
}

public class JTextBoxRadioButtonDemo {
	public static void main(String[] args) {
		JTextBoxRadioButtonFrame f = new JTextBoxRadioButtonFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
