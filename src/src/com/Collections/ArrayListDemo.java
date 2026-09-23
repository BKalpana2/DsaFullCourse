package src.com.Collections;

import java.util.*;

class Employee{
	int empId;
	String empName;
	public Employee(int empId,String empName) {
		super();
		this.empId=empId;
		this.empName=empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

	public String toString() {
		return "Employee[empId="+empId+",empname="+empName;
	}
}
public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList <Employee> al=new ArrayList();
		al.add(new Employee(123,"bahu"));
		al.add(new Employee(121,"bali"));
		al.add(new Employee(129,"devasena"));
		for(Employee e:al) {
			System.out.println(e.getEmpId()+" "+e.getEmpName());
		}

	}


}
