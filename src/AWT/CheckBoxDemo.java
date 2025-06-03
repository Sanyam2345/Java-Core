package AWT;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends Frame implements ItemListener{
    Label l;
    Checkbox c1, c2, c3;
    CheckBoxDemo() {
        super ("CheckBoxDemo");
        setLayout(new FlowLayout());
        l= new Label("No Language Selected");
        CheckboxGroup cfg = new CheckboxGroup(); // Convert checkbox to radiobutton
//        c1 = new Checkbox("Java ");
//        c2 = new Checkbox("C++ ");
//        c3 = new Checkbox("C# ");
        c1 = new Checkbox("Java ",false,cfg);
        c2 = new Checkbox("C++ ",false,cfg);
        c3 = new Checkbox("C# ",false,cfg);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    public void itemStateChanged(ItemEvent e) {
        String str  = "";
        if (c1.getState())
            str = str + c1.getLabel();
        if (c2.getState())
            str = str + c2.getLabel();
        if (c3.getState())
            str = str + c3.getLabel();
        if (str.isEmpty())
            str = "No Language Selected";

        l.setText(str);

    }

    public static void main(String[] args) {
        CheckBoxDemo frame = new CheckBoxDemo();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
