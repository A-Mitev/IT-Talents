import java.util.Scanner;

public class Task_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = "asd-12sdf45-56asdf100";
		int sum = 0;
		String bufferString = "";

		for (int index = 0; index < input.length(); index++) {
			boolean isDigit = (input.charAt(index) >= (char) 48) && (input.charAt(index) <= (char) 57);
			
			if (!((input.charAt(index) == '-') || isDigit)) {
				if (bufferString != "") {
					sum += Integer.parseInt(bufferString);
				}
				bufferString = "";
			} else {

				if ((input.charAt(index) == '-') || isDigit) {
					if (input.charAt(index) == '-') {
						if ((index > 0) && !(bufferString.isEmpty()) && Character.isDigit(input.charAt(index - 1))) {
							sum += Integer.parseInt(bufferString);
							bufferString = "";
						}
						if ((index != input.length() - 1) && (input.charAt(index + 1) != '-')
								&& Character.isDigit(input.charAt(index + 1))) {
							bufferString += "-";
						}
					} else {
						if (input.charAt(index) != '-') {
							bufferString += input.charAt(index);
						}
					}

				} else {
					if (!bufferString.isEmpty()) {
						sum += Integer.parseInt(bufferString);
					}
				}
			}
		}
		if (!bufferString.isEmpty()) {
			sum += Integer.parseInt(bufferString);
		}
		System.out.println("Sum = " + sum);
		
		scanner.close();
	}

}
