import java.util.Arrays;

public class Selection_Sort {
	static void selectionSort(int[] num) {
		for (int sortedCount = 1; sortedCount < num.length; sortedCount++) {
			int maxIndex = 0;
			for (int index = 0; index <= num.length - sortedCount; index++) {
				if (num[index] > num[maxIndex]) {
					maxIndex = index;
				}
			}
			int temp = num[maxIndex];
			num[maxIndex] = num[num.length - sortedCount];
			num[num.length - sortedCount] = temp;
		}
	}

	public static void main(String[] args) {
		int[] num = { 40, 6, 82, 12, 41, 41, 59, -32, 61 };
		selectionSort(num);
		System.out.println(Arrays.toString(num));

	}
}