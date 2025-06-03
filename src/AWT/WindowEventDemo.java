package AWT;

import java.awt.*;
import java.awt.event.*;

class WindowEventFrame extends Frame implements WindowListener {
    Label l;

    WindowEventFrame() {
        super("Window Event Demo");
        setLayout(new FlowLayout());
        l = new Label("                         ");
        add(l);
        addWindowListener(this);

    }

    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}

public class WindowEventDemo {
    public static void main(String[] args) {
        WindowEventFrame frame = new WindowEventFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
