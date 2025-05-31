package JavaIOStreams;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreams {
    public static void main(String[] args) throws Exception {
            FileInputStream fis = new FileInputStream("Test.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            System.out.println(new String(b));
            fis.close();
    }
}
