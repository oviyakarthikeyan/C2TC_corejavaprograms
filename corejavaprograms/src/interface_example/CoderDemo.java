package interface_example;

public class CoderDemo {

	public static void main(String[] args) {
		Coder c=new Student();
		c.codingWorks();
		
		System.out.println();
		
		c=new Teacher();
		c.codingWorks();
		

	}

}
