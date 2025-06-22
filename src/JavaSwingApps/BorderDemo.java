package JavaSwingApps;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

class BorderFrame extends JFrame {

    JPanel p;
    JTextField tf;
    JLabel l;
    JButton b;

    BorderFrame() {
        super("Border Demo");
        p = new JPanel();
        tf = new JTextField(15);
        l = new JLabel("Name");
        b = new JButton("Click");
        p.add(l);
        p.add(tf);
        p.add(b);
        Border br = BorderFactory.createRaisedBevelBorder();
        p.setBorder(br);

        setLayout(new FlowLayout());
        add(p);

    }
}

public class BorderDemo {

    public static void main(String[] args) {
        BorderFrame f = new BorderFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
