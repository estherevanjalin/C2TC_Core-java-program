package day8.InterFace;

public class ShoppingmallExcuetor {
	public static void main(String[]args) {
		Purchase p1 = new Clothes();
		Purchase p2 = new Grocery();
		p1.buying();
		p2.buying();
	}

}
