package src.com.ClassTasks;
import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the cutsomer name : ");
		String name=s.next();
		System.out.println("Enter the product name :");
		String product=s.next();
		System.out.println("Enter the product cost : ");
		int cost=s.nextInt();
		System.out.println("Enter the discount amount : ");
		int amount=s.nextInt();
		System.out.println("purchased price : "+(cost-amount));
		s.close();

	}

}
