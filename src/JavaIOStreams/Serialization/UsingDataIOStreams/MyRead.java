package JavaIOStreams.Serialization.UsingDataIOStreams;
import JavaIOStreams.Serialization.Student;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class MyRead {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("MyFile.txt");
        DataInputStream dis = new DataInputStream(fis);
        Student student = new Student();
        student.name = dis.readUTF();
        student.rollno = dis.readInt();
        student.dept = dis.readUTF();
        System.out.println("Roll no: "+student.rollno + "\nName: " + student.name + "\nDepartment: " + student.dept);
        dis.close();

    }
}
