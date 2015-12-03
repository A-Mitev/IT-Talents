import java.util.Scanner;

public class Task_06 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String sentense = scanner.nextLine();
		String[] allWords = sentense.split(" ");
		
		for (int i = 0; i < allWords.length; i++) {
			System.out.print(allWords[i].toUpperCase().charAt(0) 
					+ allWords[i].substring(1, allWords[i].length()) + " ");
		}
	}

}
