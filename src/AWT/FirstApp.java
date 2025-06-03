package AWT;
import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {
        Frame f = new Frame("My First App");
        f.setLayout(new FlowLayout());
        Button b = new Button("Click Me");
        Label l = new Label("Text");
        TextField t = new TextField("Enter Here...");
        f.add(l);
        f.add(t);
        f.add(b);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
