package interface_example;

public class Student implements Coder{
	@Override
	public void codingWorks() {
		System.out.println("Must wake up at "+wakeuptime);
		System.out.println("Working with the eclipse and Github");
	}
}
