package JavaIOStreams;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPractice {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Test.txt");
            int x;
            while ((x = fr.read())!=-1) {
                System.out.print((char)x);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
