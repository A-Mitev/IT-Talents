public class SimpleTask5 {
	public static void main(String[] args) {
		int[][] array = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
			};
		
		int currentSum = 0;
		int maxSum = 0;
		int currentRow = 0;
		int rowWithMaxSum = 0;
		
		for (int i = 0; i < array.length; i++) {
			currentRow++;
			for (int j = 0; j < array[i].length; j++) {
				currentSum += array[i][j];
			}
			if (currentSum > maxSum){
				maxSum = currentSum;
				rowWithMaxSum = currentRow;
			}
			currentSum = 0;
		}
		
		System.out.println("The row with maximum of " + maxSum + " is " + rowWithMaxSum);
	}

}
