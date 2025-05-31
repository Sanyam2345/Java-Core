package JavaIOStreams.Serialization.UsingPrintStreamAndBufferedReader;

import JavaIOStreams.Serialization.Student;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class MyWrite {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("My.txt");
        PrintStream ps = new PrintStream(fos);
        Student s = new Student();
        s.rollno = 31; s.name = "Sanyam"; s.dept = "CSE";
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
    }
}
