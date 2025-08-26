package userdefinedexception_example;

public class CheckAge {
	public void checkAge(Person person,int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Invalid age found: " + age + " must be greater than 18.");
		}
	}
}
