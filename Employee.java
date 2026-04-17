class Employee {
private String employeeID;
private String name;
private String designation;
private double salary;
public Employee(String employeeID, String name, String designation, double salary) {
this.employeeID = employeeID;
this.name = name;
this.designation = designation;
this.salary = salary;
}
public void applyIncrement(double percentage) {
this.salary += (salary * percentage / 100);
}
public void displayEmployee() {
System.out.println("Employee ID: " + employeeID);
System.out.println("Name: " + name);
System.out.println("Designation: " + designation);
System.out.println("Salary: " + salary);
}
}
// Test Code for Employee
class EmployeeTest {
public static void main(String[] args) {
Employee emp1 = new Employee("E101", "John Doe", "Software Engineer", 75000);
emp1.displayEmployee();
emp1.applyIncrement(10);
emp1.displayEmployee();
}
}