package JavaIOStreams.Serialization.SerializationFinal;

import JavaIOStreams.Serialization.Student;

import java.io.*;

public class MyRead {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("MyTest.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = new Student();
        s = (Student) ois.readObject();
        System.out.println("Roll no: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Department: " + s.dept);
        ois.close();
        fis.close();
    }
}
