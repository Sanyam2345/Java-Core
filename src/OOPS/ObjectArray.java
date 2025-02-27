package OOPS;

class Subjects {
    private int subId;
    private String name;
    private double maxMarks;
    private double marksObtained;
    public Subjects(int subId, String name, double maxMarks, double marksObtained) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }
    public int getSubId() {
        return subId;
    }
    public void setSubId(int subId) {
        this.subId = subId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMaxMarks() {
        return maxMarks;
    }
    public void setMaxMarks(double maxMarks) {
        this.maxMarks = maxMarks;
    }
    public double getMarksObtained() {
        return marksObtained;
    }
    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }
}

class Students {
    private int rollNo;
    private String name;
    private String dept;
    private Subjects []subjects;
    public Students(int rollNo, String name, String dept, Subjects []subjects) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void getSubjects() {
        for (Subjects s:subjects) {
            System.out.println("Subject: " + s.getName() + "\tMarks: " + s.getMarksObtained());
        }
    }
    public void setSubjects(Subjects sub[]) {
        sub = subjects;
    }
}

public class ObjectArray {
    public static void main(String[] args) {
        Subjects subjects[] = new Subjects[3];
        subjects[0] = new Subjects(01,"DSA",100.00,98);
        subjects[1] = new Subjects(02,"OOPs",100.00,95);
        subjects[2] = new Subjects(03,"Java",100.00,99);
        Students students = new Students(31,"Sanyam","CSE",subjects);
        System.out.println("Student Name: " + students.getName());
        System.out.println("Roll No: " + students.getRollNo());
        System.out.println("Department Name: " + students.getDept());
        System.out.println("Subject Name & Marks Obtained: ");
        students.getSubjects();
    }
}
