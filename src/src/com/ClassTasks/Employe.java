package src.com.ClassTasks;

public class Employe  {
/*	int salary=30000;

	public void getSalary(int salary) {
		salary=20000;
		System.out.println(salary);
		System.out.println(this.salary);
	}
	
	public static void main(String[] args) {
		Employe e=new Employe();
		e.getSalary(10000);

	}
}
class Person{
	int salary=60000;
	public void getSalary(int salary) {
		salary=50000;
		System.out.println("parent Salary is : "+salary);
		System.out.println("parent class global salary : "+this.salary);
	}
}*/
	int salary=30000;
public void display(int salary) {
//	salary=20000;
	System.out.println(salary);
	System.out.println(this.salary);
}
public static void main(String[]args) {
	Employe e =new Employe();
	e.display(10000);
}


}
