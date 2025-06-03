package AWT;
import java.awt.*;
import java.awt.event.*;

class ScrollbarFrame extends Frame implements AdjustmentListener{
    Scrollbar red, green, blue;
    TextField tf;
    ScrollbarFrame() {
        super("Scrollbar Demo");
        tf = new TextField(15);
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        tf.setBounds(100, 50, 200, 20);
        red.setBounds(100, 100, 200, 20);
        green.setBounds(100, 150, 200, 20);
        blue.setBounds(100, 200, 200, 20);
        setLayout(null);
        add(tf);
        add(red);
        add(green);
        add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

    }
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
    }

}

public class ScrollbarDemo {
    public static void main(String[] args) {
        ScrollbarFrame frame = new ScrollbarFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
