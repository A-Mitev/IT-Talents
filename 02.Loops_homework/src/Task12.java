public class Task12 {
	public static void main(String[] args) {
		
		for (int index = 100; index < 1000; index++) {
			int firstDigit = (index  / 100) % 10;
			int secondDigit = (index / 10) % 10;
			int thirdDigit = index % 10;
			
			if ((firstDigit != secondDigit) && (secondDigit != thirdDigit) && (firstDigit != thirdDigit)){
				System.out.print(index + " ");
			} else {
				continue;
			}
		}
	}

}
