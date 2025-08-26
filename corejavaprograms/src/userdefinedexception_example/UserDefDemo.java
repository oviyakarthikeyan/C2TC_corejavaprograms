package userdefinedexception_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDefDemo {
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			Person person=new Person();
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			person.setName(name);
			System.out.println("Enter Age: ");
			int age = sc.nextInt();
			person.setAge(age);
			CheckAge check=new CheckAge();
			check.checkAge(person, age);
			System.out.println("Yes,Eligible");
		}
		catch (InvalidAgeException e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}

		catch (InputMismatchException e) {

			// e.printStackTrace();
			System.err.println("Enter Valid Input");
		}
	}
}
