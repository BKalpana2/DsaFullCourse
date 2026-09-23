package src.com.ClassTasks;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the emp id :");
	int emp_id=s.nextInt();
	System.out.println("Enter the employee name : ");
	String emp_name=s.next();
	System.out.println("Enter the employee salary : ");
	float salary=s.nextFloat();
	System.out.println("Enter the comapany name : ");
	String company=s.next();
	System.out.println("Employee id :  "+emp_id);
	System.out.println("Employee name : "+emp_name);
	System.out.println("Employee salary : "+salary);
	System.out.println("Employee company : "+company);
	double annual=salary*12;
	System.out.println("Annual salary : "+annual);
	
	s.close();

	}

}
