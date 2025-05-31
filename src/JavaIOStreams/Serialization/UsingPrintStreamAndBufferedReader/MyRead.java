package JavaIOStreams.Serialization.UsingPrintStreamAndBufferedReader;

import JavaIOStreams.Serialization.Student;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyRead {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("My.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        System.out.println(s.rollno + " " + s.name + " " + s.dept);
        br.close();
        fis.close();
    }
}
