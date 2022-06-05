package ExamplePackage;
import java.util.Scanner;

public class ExampleClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter something in String");
		
		String something = input.nextLine();
		System.out.println("Get this: " + something);
		input.close();
	}

}
