package ProblemOne;

public class Student extends Person {
    // Data fields
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }
    // Getter 
    public String getIdNum () {
        return myIdNum;
    }

    public double getGPA () {
        return myGPA;
    }

    // setter
    public void setIdNum (String idNum){
        myIdNum =idNum;
    }

    public void setGPA (double gpa) {

        myGPA = gpa;
    }

    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}   