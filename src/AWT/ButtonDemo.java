package AWT;
import java.awt.*;
import java.awt.event.*;

class MyButtonListener extends Frame implements ActionListener{
    Label l;
    int count = 0;
    Button b;
    MyButtonListener() {
        super ("My Button Demo");
        setLayout(new FlowLayout());
        l= new Label("  " + count);
        b = new Button("Click");
        add(l);
        b.addActionListener(this);
        add(b);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("  " + count);
    }
}

public class ButtonDemo {
    public static void main(String[] args) {
        MyButtonListener frame = new MyButtonListener();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
