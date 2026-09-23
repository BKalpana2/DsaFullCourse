package src.com.ClassTasks;

public class ThisSuper {
	public ThisSuper(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println(name);
	}
	String name;

	public static void main(String[] args) {
	ThisSuper ts=new ThisSuper("bhubali");
	ts.display();

	}

}
