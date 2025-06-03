package AWT;
import java.awt.*;
import java.awt.event.*;

class ListAndChoiceFrame extends Frame implements ItemListener {
    List l;
    Choice c;
    TextArea ta;
    ListAndChoiceFrame() {
        super ("List and Choice Demo");
        setLayout(new FlowLayout());
        l = new List();
        c = new Choice();
        ta = new TextArea(10, 20);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        c.add("Java");
        c.add("C++");
        c.add("C#");
        c.add("Python");
        c.add("JavaScript");
        add(c);
        add(l);
        add(ta);
        c.addItemListener(this);
        l.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c)
            ta.setText(c.getSelectedItem());
        else
            ta.setText(l.getSelectedItem());
    }

}

public class ListAndChoiceDemo {
    public static void main(String[] args) {
        ListAndChoiceFrame f = new ListAndChoiceFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
