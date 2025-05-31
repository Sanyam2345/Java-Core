package JavaIOStreams;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CopyingTheContent {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("UpperCase.txt");
            FileOutputStream fos = new FileOutputStream("lowercase.txt");
            byte []b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
            str = str.toLowerCase();
            System.out.println(str);
            fos.write(str.getBytes());
            fis.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
