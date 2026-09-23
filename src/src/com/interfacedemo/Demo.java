package src.com.interfacedemo;

interface A{
	void m1();
	  default void sleeping() {
		System.out.println("sleeping with dreamzzzz");
	}
}
public class Demo implements A{
	@Override
	public void m1() {
		System.out.println("eating in the class");
		
	}
	public void sleeping() {
		System.out.println("sleeping with dreamz along with eating....");
	}
	public static void main(String[]args) {
		Demo d=new Demo();
		d.m1();
		d.sleeping();
	}

}
