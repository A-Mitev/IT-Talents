import java.util.Arrays;

public class Test_Class_task {
	static void sortFunction(int[] array){
		
		for (int index = 0; index < array.length -1; index++) {
			int temp = 0;
			
			for (int k = 0; k < index -1; k++) {
				if (array[k] > array[k +1]){
					temp = array[k];
					array[k]= array[k+1];
					array[k+ 1] = temp;
				}
			}
			System.out.println(Arrays.toString(array));	
		}
	}
	
	public static void main(String[] args) {
		int[] array = {3,2,4,6,3,2,5};
	}
}
