package JavaIOStreams;

import java.io.ByteArrayOutputStream;

public class PractiseByteOutputStream {
    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');
        bos.write('g');
        byte[] b = bos.toByteArray();
        for (byte bb : b) {
            System.out.print((char)bb);
        }
    }
}
