package JavaIOStreams;

import java.io.*;
public class FileDemo {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\SANYAM\\OneDrive\\Desktop");
        System.out.println(f.exists());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.isHidden());
        File list[] = f.listFiles();
        for(File x : list){
            System.out.print(x.getName()+" ");
            System.out.println(x.getPath());
        }
    }
}
