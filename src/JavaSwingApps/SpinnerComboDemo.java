package JavaSwingApps;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

class SpinnerComboFrame extends JFrame implements ListSelectionListener, ActionListener, ChangeListener{
	JSpinner js1,js2;
	JComboBox jc;
	JList jl;
	JTextField jt;
	SpinnerComboFrame () {
		super ("Spinner and Combo Demo");
		setLayout(new FlowLayout());
		jt = new JTextField(15);
		String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String nations[] = {"India", "Australia", "England", "USA", "China"};
		String months[] = {"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		jl = new JList(months);
		jc = new JComboBox(nations);
		js1 = new JSpinner(new SpinnerNumberModel(1,1,32,1));
		js2= new JSpinner(new SpinnerListModel(days));
		JScrollPane jsp = new JScrollPane(jl);
		add(jc);
		add(js1);
		add(js2);
		add(jsp);
		add(jt);
		
		jl.addListSelectionListener(this);
		jc.addActionListener(this);
		js1.addChangeListener(this);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		jt.setText((String)jl.getSelectedValue());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jt.setText((String)jc.getSelectedItem());
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==js1)
			jt.setText(js1.getValue()+"");
		if(e.getSource()==js2)
			jt.setText(js2.getValue() + "");
	}
}

public class SpinnerComboDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpinnerComboFrame f = new SpinnerComboFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
