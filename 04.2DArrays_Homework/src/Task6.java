public class Task6 {
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
		int sumOfAll = 0;
		
		for (int index = 0; index < array.length; index++) {
			for (int j = 0; j < array[index].length; j++) {
				if(index % 2 == 0){
					break;
				} else {
					currentSum += array[index][j];
					if (j == array.length -1){
						System.out.print(array[index][j]);
						break;
					}
					System.out.print(array[index][j] + ",");
				}
				
			}
			if (currentSum > 0){
				System.out.println(" sum " + currentSum);
				sumOfAll += currentSum;
				currentSum = 0;
			}
		}
		System.out.println("Sum of elements " + sumOfAll);
	}

}
