import java.util.Scanner;

public class Simple_Task_1 {
		public static int fibonacci(int input)  {
		    if(input == 0)
		        return 0;
		    else if(input == 1)
		      return 1;
		   else
		      return fibonacci(input - 1) + fibonacci(input - 2);
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println(fibonacci(input));
		
		
		scanner.close();
	}
}
