package JavaIOStreams;
import java.io.*;

public class RandomAccessDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile("Test.txt", "rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('&');
        System.out.println((char)rf.read());
        rf.skipBytes(2);
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer());
        System.out.println((char)rf.read());
        rf.close();
    }
}
