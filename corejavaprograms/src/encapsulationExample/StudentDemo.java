package encapsulationExample;

public class StudentDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		
		s.setSid(101);
		s.setSname("Oviya");
		s.setAvg(89.5f);
		
		System.out.println(s);

		Student s1=new Student();
		
		s1.setSid(102);
		s1.setSname("Leelaa");
		s1.setAvg(89.7f);
		
		System.out.println(s1);
		
	}

}