import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter size of array.");
		int[] array = new int[scanner.nextInt()];
		int arrayLength = array.length;
		int[] arrayReverse = new int[arrayLength];

		System.out.println("Please enter digits for the array.");

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < array.length; i++) {               // obrushtam purviq masiv s pomoshtta na novmasiv
			arrayReverse[i] = array[arrayLength - 1];
			arrayLength--;
		}

		/*for (int i = 0; i < arrayReverse.length; i++) {       Za proverka dali e korekten oburnatiq masiv.
			System.out.print(arrayReverse[i] + " ");
		}*/
		
		for (int i = 0; i < arrayReverse.length; i++) {         // obrushtam oburnatiq masiv bez nov masiv
			int temp = arrayReverse[i];
			arrayReverse[i] = arrayReverse[arrayReverse.length - i- 1];
			arrayReverse[arrayReverse.length - i -1] = temp;
			if(arrayReverse.length % 2 == 0){
				if (i == arrayReverse.length / 2 - 1){
					break;
				}
			}
			if (arrayReverse.length % 2 != 0){
				if (i == arrayReverse.length / 2){
					break;
				}
			}
		}
		
		for (int i = 0; i < arrayReverse.length; i++) {
			System.out.print(arrayReverse[i]);
		}

	}

}
