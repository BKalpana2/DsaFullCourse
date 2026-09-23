package src.com.ClassTasks;
import java.util.Scanner;
public class MenuCard {
	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);
		  System.out.println("Menu card");
		  System.out.println("	1- Veg biryani -₹89");
		  System.out.println("	2- Pizza -₹99");
		  System.out.println("	3- Biryani -₹199");
		  System.out.println("	4- Burger -₹79");
		  System.out.println("	5-French Fries -₹69");
		  System.out.println("	6-Hyderabad Biryani -₹299");
		  System.out.println("😊😊😊😊😊Welcome to our restuarant😊😊😊😊😊");
		  System.out.print(" Choose an option : ");
		  int option =s.nextInt();
		  switch(option) {
		  case 1 -> System.out.println("Veg Biryani"); 
		  case 2 -> System.out.println("Pizza"); 
		  case 3 -> System.out.println("Biryani");
		  case 4 -> System.out.println("Burger");
		  case 5 ->System.out.println("French Fries"); 
		  case 6->System.out.println("Hyderbad Biryani");
		  default ->System.out.println("Please choose the option according to the menu card"); }
		  System.out.println("Enjoy your Food !!");
		  Thread.sleep(3000);
		  System.out.println("Have a great Day ......");
		 
		s.close();

	}

}
