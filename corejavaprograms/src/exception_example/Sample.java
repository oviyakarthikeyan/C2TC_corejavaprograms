package exception_example;

public class Sample {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[0]=11;
			a[1]=12;
			System.out.println(a[6]);//throw raise exception object
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception: "+e.getMessage());
		}
		System.out.println("Next Line");
	}

}
