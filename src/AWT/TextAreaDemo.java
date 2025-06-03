package AWT;
import java.awt.*;
import java.awt.event.*;

class TextAreaFrame extends Frame {
    TextArea ta;
    TextField tf;
    Button b;
    TextAreaFrame() {
        super ("Text Area Demo");
        setLayout(new FlowLayout());
        ta = new TextArea(10, 20);
        tf  = new TextField(15);
        b = new Button("Click");
        b.addActionListener(new Handler());
        add(ta);
        add(tf);
        add(b);
    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ta.insert(tf.getText() + "\n", ta.getCaretPosition());
        }
    }
}


public class TextAreaDemo {
    public static void main(String[] args) {
        TextAreaFrame frame = new TextAreaFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
