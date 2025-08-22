package shoppingmall;

public class ShoppingmallDemo {
	public static void main(String[] args) {
		Shopping s;
		s=new Clothes();
		s.purchase();
		
		s=new Electronics();
		s.purchase();
	}
}