package JavaIOStreams.Serialization.SerializationFinal;
import JavaIOStreams.Serialization.Student;
import java.io.*;

public class MyWrite {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("MyTest.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s = new Student();
        s.rollno = 10; s.name= "Sanyam"; s.dept = "CSE";
        oos.writeObject(s);
    }
}
