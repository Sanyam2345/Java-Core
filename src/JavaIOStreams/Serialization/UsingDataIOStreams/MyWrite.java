package JavaIOStreams.Serialization.UsingDataIOStreams;

import JavaIOStreams.Serialization.Student;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class MyWrite {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("MyFile.txt");
        DataOutputStream oos = new DataOutputStream(fos);
        Student student = new Student();
        student.rollno = 10;
        student.name = "John Doe";
        student.dept = "Software Engineering";
        oos.writeUTF(student.name);
        oos.writeInt(student.rollno);
        oos.writeUTF(student.dept);
    }
}
