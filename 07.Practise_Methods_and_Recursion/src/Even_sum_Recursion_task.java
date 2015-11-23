import java.util.Scanner;

public class Even_sum_Recursion_task {
	
	static int evenSumFunc(int number){
		if(number == 2){
			return 2;
		}
		if (number < 2){
			return 0;
		}
		if (number % 2 == 0){
			return number + evenSumFunc(number - 2);
		} else {
			return evenSumFunc(number - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		System.out.println(evenSumFunc(number));
		scanner.close();
	}
}