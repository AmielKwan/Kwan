package Kwan;


public class Student 
{
    private int ID;
    private double credit;
    private double point;
    private final double SCALE = 4;
    private double gpa;

    public int getStudentID() {
        return ID;
    }

    public void setStudentID(int studentID) {
        this.ID = studentID;
    }

    public double getCreditHours() {
        return credit;
    }

    public void setCreditHours(double creditHours) {
        this.credit = creditHours;
    }

    public double getPoints() {
        return point;
    }

    public void setPoints() {
        point = (credit * SCALE);
    }

    public double getGradePointAv() {
        return gpa;
    }

    public void setGradePointAv() {
        gpa = (point / credit);
        
        this.gpa = gpa;
    }
    
    public void studentInput(){
      
    System.out.println("Student ID " + getStudentID());
    System.out.println("Credit hours " + getCreditHours());
    System.out.println("Points " + getPoints());
    System.out.println("GPA " + getGradePointAv());
    
    }
    
}
