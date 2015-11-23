import java.util.Arrays;

public class Task_13 {
	
	static int[] combineFunction(int[] firstArray, int[] secondArray){
		int[] thirdArray = new int[firstArray.length + secondArray.length];
		int secondArrayStartIndex = 0;
		for (int index = 0; index < thirdArray.length; index++) {
			if(index < firstArray.length){
				thirdArray[index] = firstArray[index];
			} 
			if (index >= firstArray.length){
				thirdArray[index] = secondArray[secondArrayStartIndex];
				secondArrayStartIndex++;
			}
		}
		return thirdArray;
	}
	
	
	
	public static void main(String[] args) {
		int[] firstArray = {1,2,3,4,5};
		int[] secondArray = {6,7,8,9,10};
		
														// Taka napisano izglezda izvrateno! :)
//		for (int index = 0; index < combineFunction(firstArray, secondArray).length; index++) {        
//			System.out.print(combineFunction(firstArray, secondArray)[index]);
//		}
		
		System.out.println(Arrays.toString(combineFunction(firstArray, secondArray)));
	}

}
