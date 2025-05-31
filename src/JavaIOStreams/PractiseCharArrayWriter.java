package JavaIOStreams;

import java.io.CharArrayWriter;

public class PractiseCharArrayWriter {
    public static void main(String[] args) throws Exception{
        CharArrayWriter caw = new CharArrayWriter(20);
        caw.write('a');
        caw.write('b');
        caw.write('c');
        caw.write('d');
        caw.write('e');
        caw.write('f');
        caw.write('g');
        char[] c = caw.toCharArray();
        for (char cc : c) {
            System.out.print(cc);
        }
    }
}
