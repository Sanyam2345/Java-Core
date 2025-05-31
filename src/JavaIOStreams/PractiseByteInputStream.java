package JavaIOStreams;

import java.io.ByteArrayInputStream;

public class PractiseByteInputStream {
    public static void main(String[] args) throws Exception{
        byte[] b = {'a','b','c','d','e','f','g'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int x;
        while ((x = bis.read())!=-1) {
            System.out.println((char)x);
        }
        bis.close();
    }
}
