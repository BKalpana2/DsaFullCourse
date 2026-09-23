package src.com.interfacedemo;

interface AB{
	 void d1();
	 default void d2() { System.out.println("d2 method");}
}
interface B{
	void c1();
	default void c2() {System.out.println("c2 method");}
}

public class MultipleInterface implements AB,B {
	public void d1() {
		System.out.println("A  method");
	}
	@Override
	public void d2() {
		System.out.println("A default method");
		AB.super.d2();
	}
	public void c1() {
		System.out.println("B method");
	}
	@Override
	public void c2() {
		System.out.println("B default method");
		B.super.c2();
	}
	public static  void main(String[] args) {
		MultipleInterface m=new MultipleInterface();
		m.c1();
		m.c2();
		m.d1();
		m.d2();
		
	}
}
