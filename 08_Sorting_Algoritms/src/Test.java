public class Test {
	
	public static void main(String[] args) {
		int x = 2;
		int y = x++ ;
		System.out.println("Y = " + y);
		System.out.println("X = " + x);
		y += --x;
		
		System.out.println(y);
	}

}
