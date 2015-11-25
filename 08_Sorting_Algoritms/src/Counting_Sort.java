import java.util.Arrays;

public class Counting_Sort {

	static void countingSort(int[] a) {
		int max = a[0];
		int min = Integer.MAX_VALUE;
		
		for (int index=0; index < a.length; index++) {
			if (a[index] > max) {
				max = a[index];
			}
			if (a[index] < min){
				min = a[index];
			}
		}
		min *= -1;
		int[] count = new int[max + min+1];
		
		for (int index=0; index < a.length; index++) {
			int element = a[index] + min;
			count[element]++;
		}
		
		
		System.out.println(Arrays.toString(a));
		
		for (int value=0; value <= max; value++ ) {
			int countOfThatValue = count[value];
			
			while (countOfThatValue > 0) {
				System.out.print(value - min + " ");
				countOfThatValue--;
			}
		}
	}

	public static void (String[] args) {
		int[] a = { 1, 2, -2, 0, 0, 1, -2, 0, 1, 0, 2 };
	}
}