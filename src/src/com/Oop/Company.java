package src.com.Oop;
import java.util.Scanner;
class Employee{
	int empId;
	String name;
	double salary;
	Scanner s=new Scanner(System.in);
	 void readDetails() {
		System.out.println("Enter the ID : ");
		empId=s.nextInt();
		System.out.println("Enter the name : ");
		name=s.next();
		System.out.println("Enter the salary : ");
		salary=s.nextDouble();
	}
	void dispalyDetails() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee name : "+name);
		System.out.println("Employee Salary : "+salary);
	}
}
public class Company {

	public static void main(String[] args) {


	}

}
