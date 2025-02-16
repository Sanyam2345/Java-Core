package OOPS;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    String course;
    int m1, m2, m3;
    Scanner sc = new Scanner(System.in);

    public void setAttributes () {
        System.out.print("Enter roll no: ");
        roll = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter course: ");
        course = sc.nextLine();
        System.out.print("Enter m1, m2, m3: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    public int total() {
        return m1+m2+m3;
    }

    public double average() {
        return (m1 + m2 + m3)/ 3;
    }

    public char grade() {
        if (average() >= 75)
            return 'A';
        else if (average() >= 50)
            return 'B';
        else if (average() >= 33)
            return 'C';
        else if (average() < 33)
            return 'F';
        else
            return '0';
    }

}

public class ClassForStudent {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Taking Student Input......");
        s.setAttributes();
        System.out.println("Displaying Results.......");
        System.out.println("Total Marks: " + s.total());
        System.out.println("Average Marks: " + s.average());
        System.out.println("Grade Marks: " + s.grade());
    }
}
