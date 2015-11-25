import java.util.Scanner;

public class Simple_Task_4 {
	
	static void triangleFunc(int startNumber, int endNumber, int endIndex){
		if(endNumber == startNumber){
			return;
		}
		
		for (int index = startNumber; index <= endIndex + 1; index++) {
			System.out.print(index+ " ");
			
		}
		endIndex++;
		System.out.println();
		triangleFunc(startNumber, endNumber -1, endIndex);
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int startNumber = scanner.nextInt();
		int endNumber = scanner.nextInt();
		int endIndex = 1;
		
		triangleFunc(startNumber, endNumber, endIndex);
	}

}
