package doubt_example;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet g=new GreetClass();
		g.greet();
		((GreetClass) g).display();
		
		GreetClass g1=new GreetClass();
		g1.greet();
		g1.display();
	}

}
