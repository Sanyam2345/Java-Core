package AWT;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class KeyEventFrame extends Frame implements KeyListener{
    Label l1, l2, l3 ,l4;
    KeyEventFrame() {
        super("Key Event Demo");
        setLayout(new FlowLayout());
        l1 = new Label("                          ");
        l2 = new Label("                        ");
        l3 = new Label("                        ");
        l4 = new Label("                        ");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        addKeyListener(this);

    }
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
        l2.setText("");
    }
    public void keyTyped(KeyEvent e) {
        l2.setText("Key Typed");
        l3.setText(new Date(e.getWhen()) + "");
    }
    public void keyReleased(KeyEvent e) {
//        l3.setText("Key Released");
        l4.setText("Key Released");
    }
}


public class KeyEventDemo {
    public static void main(String[] args) {
        KeyEventFrame frame = new KeyEventFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
