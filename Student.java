//importing util package
import java.util.Scanner;

class Student {
    private String prn;
    //variable to store student PRN
    private String name;
    //variable to store student name

    private String dob;
    //variable to store student date of birth
    private int marks;
    //variable to store student marks

    public Student(String prn, String name, String dob, int marks) {
        this.prn = prn;//assigns the value of prn passed as an argument to the prn property of the object.
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public String getPRN() {
        return prn;
        //This method returns the value of the "prn" variable.
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString() {
        return "PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks;
    }
}