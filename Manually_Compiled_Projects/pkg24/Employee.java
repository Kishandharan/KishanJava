package pkg1;
import java.util.Scanner;

public class Employee {
	String name;
	String designation;
	int emp_id;
	double salary;
	
	public Employee() {}
	
	
	public void read() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Enter the employee id: ");
		int emp_id = sc1.nextInt();
		this.emp_id = emp_id;
		
		System.out.print("Enter employee name: ");
		String name = sc2.nextLine();
		this.name = name;
		
		System.out.print("Enter employee designation: ");
		String designation = sc2.nextLine();
		this.designation = designation;
		
		System.out.print("Enter employee salary: ");
		double salary = sc1.nextDouble();//{name, empid, designation, salary} 
		this.salary = salary;
		
		
		
	}
	
	public void write() {
		System.out.println();
		System.out.println("Employee id : "+emp_id);
		
		System.out.println("Employee name : "+name);
		
		System.out.println("Employee designation : "+designation);
		
		System.out.println("Employee salary : "+salary);
	}
	
	public static void main(String[] args) {
		
		Employee[] emp1 = new Employee[5];
		for (int i = 0; i < emp1.length; i++) {
			emp1[i] = new Employee();
			emp1[i].read();
			System.out.println();
		}
		System.out.println("Employee details : ");
		for (int i = 0; i < emp1.length; i++) {
			emp1[i].write();
		}
		
	}
}
