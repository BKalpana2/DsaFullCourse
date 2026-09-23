package src.com.Oop;

//multilevel
class Grandph{
	public void tales() {
		System.out.println("Without tales we can't sleep");
	}
}
class Dad extends Grandph{
	public void house() {
		System.out.println("Hey son don't worry we have 2BHK");
	}
	public void property() {
		System.out.println("We have 1000 crores property");
	}
}

public class GrandChild extends Dad{
	public void enjoy() {
		System.out.println("I want enjoy ,sleep and parties");
	}
	public static void main(String[] args) {
		GrandChild gc=new GrandChild();
		gc.enjoy();
		gc.property();
		gc.house();
		gc.tales();
	}

}
