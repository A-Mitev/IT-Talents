public class Task01 {
	public static void main(String[] args) {

		int[][] array = {
							{ 48, 72, 13, 14, 15 },
							{ 21, 22, 53, 24, 75 },
							{ 31, 57, 33, 34, 35 },
							{ 41, 95, 43, 44, 45 },
							{ 59, 52, 53, 54, 55 },
							{ 61, 69, 63, 64, 65 }
						};
			
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int index = 0; index < array.length; index++) {
			for (int j = 0; j < array[index].length; j++) {
				if (array[index][j] < min){
					min = array[index][j];
				}
				if (array[index][j] > max){
					max = array[index][j];
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}

}
