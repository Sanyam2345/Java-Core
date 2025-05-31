package JavaIOStreams;

import java.io.CharArrayReader;

public class PractiseCharArrayReader {
    public static void main(String[] args) throws Exception{
        char[] c = {'a','b','c','d','e','f','g'};
        CharArrayReader car = new CharArrayReader(c);
        int x;
        while ((x = car.read())!=-1) {
            System.out.println((char)x);
        }
        car.close();
    }
}
