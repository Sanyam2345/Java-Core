package JavaCollectionFrameworks;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception{
//        String data = "Name=Sanyam;Branch=CSE;Section=B;Institute=Faculty Of Technology";
        FileInputStream fis = new FileInputStream("File.txt");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        String str = new String(data);
        StringTokenizer st = new StringTokenizer(str, "=");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
