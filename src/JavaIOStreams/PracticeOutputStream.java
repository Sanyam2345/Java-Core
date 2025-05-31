package JavaIOStreams;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeOutputStream {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("Test.txt");
            String str = "Sanyam is a good Boy";
            byte[] bytes = str.getBytes();
//            fos.write(str.getBytes());
//            for (byte b : bytes)
//                fos.write(b);
            fos.write(bytes, 12, bytes.length - 12);
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}
