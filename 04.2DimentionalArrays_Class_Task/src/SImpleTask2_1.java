import java.util.Scanner;

public class SImpleTask2_1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		boolean nazuben = true;
		boolean nazubenNagore = true;

		if ((array[0] < array[0 + 1])) {
			nazuben = true;
			nazubenNagore = true;
		} else if ((array[0] > array[0 + 1])) {
			nazuben = true;
			nazubenNagore = false;
		} else {
			nazuben = false;
		}

		if (nazuben && nazubenNagore) {
			for (int i = 1; i <= array.length; i += 2) {
				if ( i == array.length){
					break;
				}
				if (array.length % 2 == 0 && i == array.length - 1) {
					if (array[i] > array[i - 1]){
						nazuben = true;
						break;
					} else {
						nazuben = false;
						break;
					}
				}

				if ((array.length % 2 != 0) && (i == array.length)) {
					if (array[i -1] < array[i - 2]) {
						nazuben = true;
						break;
					} else {
						nazuben = false;
						break;
					}
				}

				if ((array[i - 1] < array[i]) && (array[i] > array[i + 1])) {
					nazuben = true;
				} else {
					nazuben = false;
					break;
				}
			}
		}

		else if (nazuben && !nazubenNagore) {
			for (int i = 1; i <= array.length; i += 2) {
				if (i == array.length){
					break;
				}
				if (i == array.length -1){
					if (array[i] < array[i - 1]){
						nazuben = true;
						break;
					} else {
						nazuben = false;
						break;
					}
				
					
				}
				if ((array.length % 2 != 0) && (array[i - 1] > (array[i]) && (array[i] < array[i + 1]))) {
					nazuben = true;
				} else {
					nazuben = false;
					break;
				}
			}
		}

		if (!nazuben) {
			System.out.println("The Array is not nazuben");
		} else {
			System.out.println("The array is nazuben");
		}
	}
}
