package JavaSwingApps;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.text.*;
import java.util.Locale;

class FormattedTextFrame extends JFrame {
	FormattedTextFrame () {
		super ("Formatted Text Demo");
		JTextField tf = new JTextField(15);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		JFormattedTextField jft = new JFormattedTextField(df);
		jft.setColumns(15);
		jft.setValue(1);
		setLayout(new FlowLayout());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormatter ff = new NumberFormatter(nf);
		ff.setAllowsInvalid(false);
		ff.setMaximum(10000);
		JFormattedTextField jff = new JFormattedTextField(ff);
		jff.setColumns(15);
		jff.setValue(0);
		
		add(tf);
		add(jft);
		add(jff);
	}
}

public class FormattedTextFieldDemo {
	public static void main(String[] args) {
		FormattedTextFrame f = new FormattedTextFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
