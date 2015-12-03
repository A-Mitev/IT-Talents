public class Class_Task_1_11_9_2015 {
	public static void main(String[] args) {
		int[][] array = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
			};
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				count++;
			}
		}
		
		int[] newArray = new int [count];
		
		int newArrayCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				newArray[newArrayCount]= array[i][j];
				newArrayCount++;
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}
