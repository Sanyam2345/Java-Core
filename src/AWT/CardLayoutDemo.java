package AWT;
import java.awt.*;
import java.awt.event.*;

class CardLayoutFrame extends Frame implements ItemListener{
    Panel p1, p2, p3;
    Panel cp;
    Panel mainp;
    Button b1,b2,b3,b4,b5,b6;
    Checkbox c1, c2, c3;
    TextField tf1, tf2, tf3;
    CardLayout cl;
    CardLayoutFrame () {
        super("Card Layout Demo");

        CheckboxGroup cfg = new CheckboxGroup();
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        cp = new Panel();
        mainp = new Panel();

        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button("Third");
        b4 = new Button("Fourth");
        b5 = new Button("Fifth");
        b6 = new Button("Sixth");

        c1 = new Checkbox("Java", true, cfg);
        c2 = new Checkbox("C++", false, cfg);
        c3 = new Checkbox("C#", false, cfg);

        tf1 = new TextField(15);
        tf2 = new TextField(15);
        tf3 = new TextField(15);

        cl = new CardLayout();

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2.add(tf1);
        p2.add(tf2);
        p2.add(tf3);

        p3.add(b4);
        p3.add(b5);
        p3.add(b6);

        cp.add(c1);
        cp.add(c2);
        cp.add(c3);

        mainp.setLayout(cl);
        mainp.add(p1, "First");
        mainp.add(p2, "Second");
        mainp.add(p3, "Third");
        add(mainp);
        add(cp, BorderLayout.NORTH);
        add(mainp, BorderLayout.CENTER);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        Container second = mainp.getParent();
        if (c1.getState())
            cl.show(mainp, "First");
        else if (c2.getState())
            cl.show(mainp, "Second");
        else
            cl.show(mainp, "Third");
    }

}

public class CardLayoutDemo {
    public static void main(String[] args) {
        CardLayoutFrame frame = new CardLayoutFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
