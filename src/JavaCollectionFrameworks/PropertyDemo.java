package JavaCollectionFrameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.setProperty("Name", "John");
        prop.setProperty("Surname", "Smith");
        prop.setProperty("Age", "25");
        prop.setProperty("Address", "123 Main St");

        prop.storeToXML(new FileOutputStream("Property.xml"), "Personal Data");
        Properties prop2 = new Properties();

        prop2.loadFromXML(new FileInputStream("Property.xml"));
        System.out.println(prop2);


    }
}
