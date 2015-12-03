import java.util.Scanner;

public class Task_02 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String firstWord = scanner.next();
		String secondWord = scanner.next();

		// Inicializiram prazni stringove ot koito da polucha krajnata duma.
		String newFirstWord = "";
		String newSecondWord = "";

		// Opredelqm dulzinata na po dulgata duma.
		int longerWord = Math.max(firstWord.length(), secondWord.length());

		// Ako purvata duma e po - dulgata ...
		if (firstWord.length() == longerWord) {
			// S pomoshtta na .substring vzimam samo neobhodimite mi simvoli i dobavqm ostanalite.
			newFirstWord = secondWord.substring(0, 6) + firstWord.substring(6, firstWord.length());
			System.out.println(longerWord + " " + newFirstWord);
		} else {
			if (firstWord.length() == longerWord) {
				newSecondWord = firstWord.substring(0, 6) + secondWord.substring(6, secondWord.length());
				System.out.println(longerWord + " " + newSecondWord);
			}
		}
	}
}
