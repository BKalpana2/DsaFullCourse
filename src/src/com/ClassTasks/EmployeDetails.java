package src.com.ClassTasks;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class EmployeDetails {
	public static void main(String[] args) {
		/*
		 * Scanner s=new Scanner(System.in); System.out.print("Enter the Emp Id : ");
		 * int id=s.nextInt(); System.out.println("Enter the name : "); String
		 * name=s.next(); System.out.println("Enter the full name : "); String
		 * fullname=s.nextLine(); s.nextLine();
		 * System.out.println("Enter the Marital Status : "); String status=s.next();
		 * System.out.println("Enter the salary :"); float salary=s.nextFloat();
		 * System.out.println("Enter the ATM pin number : "); int pin=s.nextInt();
		 * System.out.println("Enter annual salary : "); double
		 * annualSalary=s.nextDouble(); System.out.println("Enter the increment :");
		 * float amount=s.nextFloat();
		 * System.out.println("Enter the height of employee : "); int
		 * height=s.nextInt(); System.out.println("Enter the Aadhar number : "); long
		 * adhar=s.nextLong(); System.out.println("Enter the employee present/absent");
		 * String attend=s.next(); System.out.println(id); System.out.println(name);
		 * System.out.println(fullname); System.out.println(status);
		 * System.out.println(salary); System.out.println(pin);
		 * System.out.println(annualSalary); System.out.println(amount);
		 * System.out.println(height); System.out.println(adhar);
		 * System.out.println(attend);
		 * s.close();
		 */
		Scanner s=new Scanner(System.in);
		byte experiance=0;
		short departmentId=0;
		int employeId=0;
		long mobileNum=0;
		float height=0;
		double salary=0;
		boolean filepresent=false;
		BigInteger aadhar=BigInteger.ZERO;
		BigDecimal bonus=BigDecimal.ZERO;
		String employeeName="";
		String employeFullname="";
		char martialStatus=' ';
		//Employe id
		System.out.println("Enter the employe id : ");
		if(s.hasNext()) {
			employeId=s.nextInt();
		}else {
			System.out.println("Employe id is invalid");
			return;
		}
		//employee name
		System.out.println("Enter the Employee name : ");
		if(s.hasNext()) {
			employeeName=s.next();
		}else {
			System.out.println("Employee name is invalid ");
			return;
		}
		//employee full name
		System.out.println("Enter the Employee Fullname : ");
		if(s.hasNextLine()) {
			employeFullname=s.nextLine();
		}else {
			System.out.println("Employee  Fullname is invalid ");
			return;
		}
		s.nextLine();
		
		  //Experiance 
		System.out.println("Enter the Employee Experiance : ");
		  if(s.hasNextByte()) { 
			  experiance=s.nextByte(); 
			  }else {
		  System.out.println("Employee name is invalid ");
		  return; 
		  }
		 
		//departmentId
		System.out.println("Enter the Employee Department id  : ");
		if(s.hasNext()) {
			departmentId=s.nextShort();
		}else {
			System.out.println("Employee Department ID is invalid ");
		}
		//Mobile number
		System.out.println("Enter the Employee number : ");
		if(s.hasNext()) {
			mobileNum=s.nextInt();
		}else {
			System.out.println("Employee mobile number is invalid ");
			return;
		}
		//height
		System.out.println("Enter the Employee height : ");
		if(s.hasNext()) {
			height=s.nextFloat();
		}else {
			System.out.println("Employee height is invalid ");
			return;
		}
		//Salary
		System.out.println("Enter the Employee Salary : ");
		if(s.hasNext()) {
			salary=s.nextDouble();
		}else {
			System.out.println("Employee Salary is invalid ");
			return;
		}
		//File present
		System.out.println("Enter the Employee file  : ");
		if(s.hasNext()) {
			filepresent=s.nextBoolean();
		}else {
			System.out.println("Employee file is invalid ");
			return;
		}
		//Martial Status
		System.out.println("Enter the Employee martial status : ");
		if(s.hasNext()) {
			martialStatus=s.next().charAt(0);
		}else {
			System.out.println("Employee martial status is invalid ");
			return;
		}
		//Bonus
		System.out.println("Enter the Employee Bonus : ");
		if(s.hasNext()) {
			bonus=s.nextBigDecimal();
		}else {
			System.out.println("Employee Bonus is invalid ");
			return;
		}
		//AAdhar
		System.out.println("Enter the Employee Aadhar : ");
		if(s.hasNext()) {
			aadhar=s.nextBigInteger();
		}else {
			System.out.println("Employee Aadhar is invalid ");
			return;
		}
		s.close();
	}

}
