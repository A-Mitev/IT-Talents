public class Class_Tasks {
	
	static void sayHi(int userInput){
		if (userInput == 0){
			return;
		}
		System.out.println("Hi");
		
		sayHi(userInput -1);
	}
	
	public static void main(String[] args) {
		int userInput = 5;
		sayHi(userInput);
	}
}
