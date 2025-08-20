package interface_example;

public class Teacher implements Coder{
	@Override
	public void codingWorks() {
		System.out.println("Must wake up at "+wakeuptime);
		System.out.println("Checking with the Students Github");
	}
}