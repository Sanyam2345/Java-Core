package JavaSwingApps;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

class JavaInternalFrame extends JInternalFrame {
	static int count = 0;
	JTextArea ta;
	JScrollPane sp;
	
	JavaInternalFrame () {
		super ("Document " + (++count),true,true,true,true);
		ta = new JTextArea();
		sp = new JScrollPane(ta);
		add(sp);
		
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("File");
		JMenuItem mi = new JMenuItem("Save");
		
		m.add(mi);
		mb.add(m);
		setJMenuBar(mb);
		
		setSize(300,300);
		setLocation(50,50);
		setVisible(true);
		
	}
}

public class JavaInternal extends JFrame implements ActionListener{
	JDesktopPane dp;
	JavaInternal() {
		super ("Internal Frame Demo");
		dp = new JDesktopPane();
		setContentPane(dp);
		
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("Document");
		JMenuItem mi = new JMenuItem("New");
		m.add(mi);
		mb.add(m);
		setJMenuBar(mb);
		mi.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		JavaInternalFrame jf = new JavaInternalFrame();
		dp.add(jf);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaInternal ji = new JavaInternal();
		ji.setVisible(true);
		ji.setSize(500,500);
		ji.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
