package JavaSwingApps;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import javax.swing.event.*;
import java.io.File;

class JTreeFrame extends JFrame implements TreeSelectionListener {
	JTree tree;
	JLabel l;
	JTreeFrame () {
			super ("JTree");
			DefaultMutableTreeNode root = new DefaultMutableTreeNode("D:\\Java_Core");
			File f = new File("D:\\Java_Core");
			for (File x: f.listFiles()) {
				if (x.isDirectory()) {
					DefaultMutableTreeNode temp= new DefaultMutableTreeNode(x.getName());
					for (File y: x.listFiles()) {
						temp.add(new DefaultMutableTreeNode(y.getName()));
					}
					root.add(temp);
				}
				else 
					root.add(new DefaultMutableTreeNode(x.getName()));
			}
			tree = new JTree(root);
			l = new JLabel("No Files Selected");
			tree.addTreeSelectionListener(this);
			
			JScrollPane j = new JScrollPane(tree);
			add(j,BorderLayout.CENTER);
			add(l, BorderLayout.SOUTH);
			
			
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		l.setText(e.getPath().toString());
	}
}

public class JtreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTreeFrame f = new JTreeFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
