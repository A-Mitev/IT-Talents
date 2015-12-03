public class Task04 {
	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int[][] newArray = new int[array.length][array.length];

		for (int index = 0; index < array[0].length; index++) {
			for (int j = array.length - 1; j >= 0; j--) {
				newArray[index][(newArray.length - j) - 1] = array[j][index];
			}
		}
		
		for (int index = 0; index < newArray.length; index++) {
			for (int j = 0; j < newArray[index].length; j++) {
				if (j == newArray[index].length - 1) {
					System.out.print(newArray[index][j]);
					break;
				}
				System.out.print(newArray[index][j] + ", ");
			}
			System.out.println();
		}
	}
}
