package AWT;
import java.awt.*;
import java.awt.event.*;

class GridLayoutFrame extends Frame {
    Button b1, b2, b3, b4, b5, b6;
    GridLayoutFrame() {
        super("Grid Layout Demo");
        setLayout(new GridLayout(3, 2));
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        b6 = new Button("Button 6");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }
}

public class GridLayoutDemo {
    public static void main(String[] args) {
        GridLayoutFrame frame = new GridLayoutFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
