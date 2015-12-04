import java.util.Scanner;

public class Task7 {
	
// 				!!!	Tova e purvonachalniqt variant kojto e s dva cikula.   !!!
//	public static void main(String[] args) {
//		int[][] array = {
//				{11,12,13,14,15,16},
//				{21,22,23,24,25,26},
//				{31,32,33,34,35,36},
//				{41,42,43,44,45,46},
//				{51,52,53,54,55,56},
//				{61,62,63,64,65,66}
//			};
//
//		int currentSum = 0;
//		int sumOfAll = 0;
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				if ((i + j) % 2 == 0){
//					currentSum += array[i][j];
//					if (j == array.length -1 || j == array.length - 2){
//						System.out.print(array[i][j]);
//						break;
//					}
//					System.out.print(array[i][j] + ", ");
//				}
//			}
//			System.out.println(" Sum of elements for the raw: " + currentSum);
//			sumOfAll += currentSum;
//			currentSum = 0;
//		}
//		System.out.println("Sum of elements: " + sumOfAll);
//	}
//}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] array = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		
		
		int rowsCount = 6;
		int colsCount = 6;
		int sumRow = 0;
		int sumAllRows = 0;
		int row;
		int col;

		for (int index = 0; index < (rowsCount * colsCount); index++) {
			col = index % colsCount;
			row = index / rowsCount;
			if ((row + col) % 2 == 0) {
				System.out.print(array[row][col] + " ");
				sumRow = sumRow + array[row][col];
			}
			if (col == colsCount - 1) {
				System.out.print("Sum of elements for the raw: " + sumRow);
				sumAllRows = sumAllRows + sumRow;
				sumRow = 0;
				
				System.out.println();
			}
		}
		System.out.println("Sum of elements: " + sumAllRows);
	}
}

		
