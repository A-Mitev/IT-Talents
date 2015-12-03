import java.util.Arrays;
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

		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextInt();
		}

		for (int index = 0; index < array.length; index++) {               // obrushtam purviq masiv s pomoshtta na nov masiv
			arrayReverse[index] = array[arrayLength - 1];
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
		
		System.out.println(Arrays.toString(arrayReverse));
		}

	}
