// Exercise 1: Student Management System
class Student {
private String studentID;
private String name;
private double grade;
public Student() {
this.studentID = "0000";
this.name = "Unknown";
this.grade = 0.0;
}
public Student(String studentID, String name, double grade) {
this.studentID = studentID;
this.name = name;
this.grade = grade;
}
public void updateGrade(double newGrade) {
this.grade = newGrade;
}
public void displayDetails() {
System.out.println("Student ID: " + studentID);
System.out.println("Name: " + name);
System.out.println("Grade: " + grade);
}
}
// Test Code for Student
class StudentTest {
public static void main(String[] args) {
Student student1 = new Student("275195", "Samara", 100.5);
student1.displayDetails();
student1.updateGrade(90.0);
student1.displayDetails();

// create an if statenent that if the grade is over 100.0 to display: INVALID GRADE

}
}