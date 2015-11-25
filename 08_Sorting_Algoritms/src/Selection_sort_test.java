import java.util.Arrays;

public class Selection_sort_test {

	public static int[] selectSortFunc(int[] array) {
		int minNumberIndex = 0;
		int maxNumberIndex = 0;
		int temp = 0;

		for (int index = 0; index < (array.length - 1) /2; index++) {
			minNumberIndex = index;
			maxNumberIndex = (array.length -1) - index;
			for (int j = index + 1; j < array.length; j++) {
				if (array[j] < array[minNumberIndex]) {
					minNumberIndex = j;
				}
				if(array[j] > array[maxNumberIndex]){
					maxNumberIndex = j;
				}
			}
			if (minNumberIndex != index) {
				temp = array[index];
				array[index] = array[minNumberIndex];
				array[minNumberIndex] = temp;
			}
			if (maxNumberIndex != ((array.length -1) - index)){
				temp = array[(array.length -1) - index];
				array[(array.length -1) - index] = array[maxNumberIndex];
				array[maxNumberIndex] = temp;
			}
			System.out.println(Arrays.toString(array));
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 4, 3, 7, 8, 4, -1, 4, 2, 6};
		
		System.out.println(Arrays.toString(selectSortFunc(array)));
	}
}