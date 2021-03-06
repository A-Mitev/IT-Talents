import java.util.Arrays;

public class Selection_sort {
	public static void main(String[] args) {

		int[] array = { 3, 1, 5, 2, 7, 4, 5, 5, 7, -3, 8, 9, 6, -8};

		int arrayEnd = array.length - 1;
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		int maxValueIndex = 0;
		int minValueIndex = 0;

		for (int index = 0; index < array.length / 2; index++) {
			for (int j = index; j <= arrayEnd; j++) {
				if (array[j] > maxValue) {
					maxValue = array[j];
					maxValueIndex = j;

				}
				if (array[j] < minValue) {
					minValue = array[j];
					minValueIndex = j;
				}
			}

			int tempMax = array[arrayEnd];
			
			array[maxValueIndex] = tempMax;
			array[arrayEnd] = maxValue;

			int tempMin = array[index];
			array[minValueIndex] = tempMin;
			array[index] = minValue;
			

			arrayEnd--;
			maxValue = Integer.MIN_VALUE;
			minValue = Integer.MAX_VALUE;
		}
		System.out.println(Arrays.toString(array));
	}
}
