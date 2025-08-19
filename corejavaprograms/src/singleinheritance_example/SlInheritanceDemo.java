package singleinheritance_example;

public class SlInheritanceDemo {
	public static void main(String[] args) {
		Trainer t=new Trainer(112,"Oviya","Chidambaram",211,"Software Developer","Chennai");
		System.out.println(t);
		
		Person p=new Person(113,"Leela","Puducherry");
		System.out.println(p);
	}
}
