import java.util.Scanner;

public class Task_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String userInput = "Hello";
		char[] array = userInput.toCharArray();
		
		for (int index = 0; index < array.length; index++) {
			array[index] = (char) (userInput.charAt(index) + 5);
		}
		
		//System.out.println(Arrays.toString(array));   // za burza proverka na izhoda (no se printira s zapetai)
		
		
		System.out.println("Input:  " + userInput);
		
		System.out.print("Output: ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index]);
		}
		
		
		scanner.close();     // za da ne mi se pokazva udivitelnata che scenera ne e zatvoren
	}
}
