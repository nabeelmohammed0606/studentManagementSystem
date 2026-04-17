/*
Question: Develop an Employee class with attributes employeeID, name, designation, and salary.
Implement a method to apply a salary increment and decrement and another to display employee
details. Demonstrate object creation using the new operator and show how garbage
collection works when objects are no longer referenced.

*/


public class Employee {
    private String employeeID;
    private String name;
    private String designation;
    private double salary;
    private double percentage;

    public Employee(String employeeID, String name, String designation, String salary) {
        this.employeeID = "0000";
        this.name = "unknownName";
        this.designation = "unknownDesignation";
        this.salary = 0.00;
    } 


  public void applyIncrement(double percentage) {
this.salary += (salary * percentage / 100);
}

// outputs employee details
public void employeeDetails(String employeeID, String Name, String degisnation, double Salary) {
    System.out.println("Employee ID: " + employeeID + "Employee Name: " + name + "Employee Department: " + designation + "Salary: /$" + salary);
}

//
public void displayEmployee(){

}

// test for the employee

class Employeetest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "Nabee Mohammed", "devsecops engineer", "11500.00");
        emp1.displayEmployee();
        emp1.applyIncrement(10);
        emp1.displayEmployee();
    }
}
}