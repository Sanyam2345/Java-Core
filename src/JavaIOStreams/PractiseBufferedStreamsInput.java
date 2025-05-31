package JavaIOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class PractiseBufferedStreamsInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(3);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        bis.close();
    }
}
