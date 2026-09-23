package src.com.Oop;

// multiple 

class Daddy{
	public void sleep() {
		System.out.println("Sleep left side");
	}
}

class Mom{
	public void sleep() {
		System.out.println("Sleep right side");
	}
}

public class Baby extends Mom{ 
	public static void main(String[] args) {
		Baby b=new Baby();
		b.sleep();

	}

}
