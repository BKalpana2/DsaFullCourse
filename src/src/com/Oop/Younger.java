package src.com.Oop;

class Father{
	public void meet() {
		System.out.println("wants to meet both children");
	}
}
class Elder extends Father{
public void usa() {
	System.out.println("going to aboard ..want to meet dad");
}
}
public class Younger extends Father {

	public void bdy() {
		System.out.println("today his birthday ...want to meet father");
	}

	public static void main(String[] args) {
		Younger y=new Younger();
		y.bdy();
		y.meet();
		
		Elder e=new Elder();
		e.usa();
		e.meet();

	}

}
