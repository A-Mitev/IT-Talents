public class Class_Examples_Functions {

	// function
	static double sum(int a, int b) {
		if (b == 0) {
			return 0.0;
		}
		return  a / b;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 2;

		System.out.println(sum(a, b));
	}

}
