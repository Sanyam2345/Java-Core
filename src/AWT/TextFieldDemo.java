package AWT;
import java.awt.*;
import java.awt.event.*;

class TxtFieldFrame extends Frame {
    Label l1, l2;
    TextField t;
    TxtFieldFrame() {
        super ("Text Field Demo");
        setLayout(new FlowLayout());
        l1 = new Label("Noothing Entered");
        l2= new Label("Enter is not yet hit");
        t = new TextField(15);
        t.setEchoChar('.');
        t.addTextListener(new Handler());
        t.addActionListener(new Handler());
        add(l1);
        add(t);
        add(l2);
    }

    class Handler implements TextListener, ActionListener {
        public void textValueChanged(TextEvent e) {
            l1.setText(t.getText());
        }
        public void actionPerformed(ActionEvent e) {
            l2.setText(t.getText());
        }
    }
}



public class TextFieldDemo {
    public static void main(String[] args) {
        TxtFieldFrame frame = new TxtFieldFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
