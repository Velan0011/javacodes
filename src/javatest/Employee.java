//12. Employee Management: Create a parent class Employee 
//with employeeId, name, and a displayDetails() method. 
//Create Manager and Developer child classes.
//Add one child-specific field to each class and override displayDetails(). 
//In main(), create objects of both child classes and display their details.


package javatest;

public class Employee {
	int employeeid;
	String employeename;
	public void displaydetails() {
		System.out.println(employeeid+" "+employeename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager obj=new Manager();
		obj.employeeid=1;
		obj.employeename="velan";
		obj.displaydetails();
		Developer obj2=new Developer();
		obj2.employeeid=2;
		obj2.employeename="arun";
		obj2.displaydetails();

	}

}
 class Manager extends Employee{
	int employeeid;
	String employeename;
	public void displaydetails() {
		System.out.println(employeeid+" "+employeename);
	}
	
}
 class Developer extends Employee{
		int employeeid;
		String employeename;
		public void displaydetails() {
			System.out.println(employeeid+" "+employeename);
		}
 }
