package src.com.Oop;

	class Animal{
		String color="Brown";
		public void eat() {
			System.out.println("animal is Eating");
		}
	}
	class Dog extends Animal{
		public void bark() {
			System.out.println("dog is barking");
		}
	}
public class AnimalMain {
	private static String color;

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
		color = d.color;
		System.out.println(color);
	}
}
