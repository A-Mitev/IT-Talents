import java.util.Arrays;

public class Counting_Sort_test {
	
	public static int[] countingSort(int[] array, int maxNumber){
		int[] count = new int [maxNumber + 1];
		
		for (int index = 0; index < array.length; index++) {
			count[array[index]]++;
		}
		
		int[] results = new int [array.length];
		
		int counts = 0;
		for (int index = 0; index < count.length; index++) {
			while(count[index] > 0){
				results[counts++] = index;
				count[index]--;
			}
		}
		return results;
		
	}

	
	public static void main(String[] args) {
		int[] array= {3,2,6,3,3,6,6,7,3,6,4, 1};
		int maxNumber = Integer.MIN_VALUE;
		for (int index = 0; index < array.length; index++) {
			if(array[index] > maxNumber){
				maxNumber = array[index];
			}
		}
		System.out.println(Arrays.toString(countingSort(array, maxNumber)));
	}
}