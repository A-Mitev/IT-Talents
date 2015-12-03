import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		if((a > 8 || b > 8 || c > 8 || d > 8) || (a < 1 || b < 1 || c < 1 || d < 1)){
			System.out.println("Wrong Input, please repeat");
		} else {
			String firstColor;
			String secondColor;
			
			if((((a % 2 == 0) && (b % 2 == 0)) || (a == b)) || ((a % 2 != 0) && ( b % 2 != 0))){
				firstColor = "black";
			} else {
				firstColor = "white";
			}
			
			if ((((c % 2 == 0) && (d % 2 == 0)) || (c == d)) || ((c % 2 != 0) && (d % 2 != 0))){
				secondColor = "black";
			} else {
				secondColor = "white";
			}
			
			if (firstColor.equals(secondColor)){
				System.out.println("The colors are equal.");
			} else {
				System.out.println("The colors are different.");
			}	
		}
	}
}
