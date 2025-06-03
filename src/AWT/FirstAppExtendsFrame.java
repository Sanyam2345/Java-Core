package AWT;
import java.awt.*;

public class FirstAppExtendsFrame extends Frame {
    Label label;
    TextField textField;
    Button button;
    FirstAppExtendsFrame() {
        super("First App ");
        setLayout(new FlowLayout());
        label = new Label("label");
        textField = new TextField(15);
        button = new Button("OK");
        add(label);
        add(textField);
        add(button);
    }

    public static void main(String[] args) {
        FirstAppExtendsFrame frame = new FirstAppExtendsFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
