package Exceptions;

public class Exceptions {

	static void printArrayInfo(int[] array) {
		try {
			System.out.println(array.length);
			System.out.println(array[2]);
			System.out.println("Some text is printing");
		} catch (Exception w){
			System.out.println("opa");
		}
	}
	
	public static void main(String[] args) {
		int[] array = null;
		printArrayInfo(array);
	}

}
