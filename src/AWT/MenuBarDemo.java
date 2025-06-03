package AWT;
import java.awt.*;
import java.awt.event.*;

class MenuBarFrame extends Frame {
	TextField tf;
	Menu file, sub;
	MenuItem open, save, close, closeAll;
	CheckboxMenuItem auto;
	
	MenuBarFrame () {
		super ("Menu Bar");
		open = new MenuItem("Open");
		save = new MenuItem("Save");
		close = new MenuItem("Close");
		closeAll = new MenuItem("Close All");
		
		auto = new CheckboxMenuItem("Auto Save");
		
		file = new Menu("File");
		sub = new Menu("Close");
		
		file.add(open);
		file.add(save);
		file.add(sub);
		file.add(auto);
		
		sub.add(close);
		sub.add(closeAll);
		
		MenuBar mb = new MenuBar();
		mb.add(file);
		setMenuBar(mb);
		
		tf = new TextField(20);
		setLayout(new FlowLayout());
		add(tf);
		
		auto.addItemListener((ItemEvent e)-> {
			if (auto.getState())
				tf.setText("Autosave on");
			else 
				tf.setText("Autosave off");
		});
		
		open.addActionListener((ActionEvent e)->tf.setText("Open"));
		close.addActionListener((ActionEvent e)->tf.setText("Close"));
		closeAll.addActionListener((ActionEvent e)->tf.setText("Close All"));
		save.addActionListener((ActionEvent e)->tf.setText("Save"));
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { System.exit(0);}});
	}
}

public class MenuBarDemo {
	public static void main(String [] args) {
		MenuBarFrame f = new MenuBarFrame();
		f.setSize(400,400);
		f.setVisible(true);
	}
}
