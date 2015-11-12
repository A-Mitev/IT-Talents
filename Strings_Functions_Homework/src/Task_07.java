import java.util.Scanner;

public class Task_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		/*
		 * Inicializiram masiv ot stringove 
		 * razdeleni po interval (s pomoshtta na regex)
		 * nezavisimo dali intervala e edin ili poveche
		 * za da ne se otchitat nqkolko intervala kato
		 * otdelna duma.
		 */

		String[] words = input.split("\\s+");

		int maxLegth = 0;
		for (int i = 0; i < words.length; i++) {
			if (maxLegth < words[i].length()) {
				maxLegth = words[i].length();
			}
		}

		System.out.print(words.length);
		System.out.print(" " + "words, the longest is with " + maxLegth + " symbols.");
	}

}
