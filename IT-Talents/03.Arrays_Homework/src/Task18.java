public class Task18 {
	public static void main(String[] args) {

		int[] firstArray = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] secondArray = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] thirdArray = new int[secondArray.length];

		for (int index = 0; index < firstArray.length; index++) {
			if (firstArray[index] > secondArray[index]) {
				thirdArray[index] = firstArray[index];
			} else if (firstArray[index] < secondArray[index]) {
				thirdArray[index] = secondArray[index];
			} else {
				thirdArray[index] = firstArray[index];
			}
		}

		for (int index = 0; index < thirdArray.length; index++) {
			if (index == thirdArray.length - 1) {
				System.out.print(firstArray[index]);
				break;
			} else {
				System.out.print(firstArray[index] + ", ");
			}

		}  

		System.out.println();
		for (int index = 0; index < thirdArray.length; index++) {
			if (index == thirdArray.length - 1) {
				System.out.print(secondArray[index]);
				break;
			} else {
				System.out.print(secondArray[index] + ", ");
			}

		}

		System.out.println();
		for (int index = 0; index < thirdArray.length; index++) {
			if (index == thirdArray.length - 1) {
				System.out.print(thirdArray[index]);
				break;
			} else {
				System.out.print(thirdArray[index] + ", ");
			}

		}
	}
}
