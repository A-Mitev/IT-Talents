import java.util.Scanner;

public class Task_04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the three names of two persons separate ith comma.");
		String firstName1 = scanner.next().trim();
		String firstName2 = scanner.next().trim();
		String firstName3 = scanner.next().trim();
		
		// Zamenqm zapetaqta s interval i maham interlava.
		firstName3 = firstName3.replace(firstName3.charAt(firstName3.length() -1), ' ').trim();
		
		// Pravq ot trite stringa edin obsht bez intervali za da mu izchislq sumata.
		String firstFullName = (firstName1 + firstName2 + firstName3).trim();
		
		int firstNameSum = 0;
		for (int i = 0; i < firstFullName.length(); i++) {
			firstNameSum += firstFullName.charAt(i);
		}
		
		String secondName1 = scanner.next().trim();
		String secondName2 = scanner.next().trim();
		String secondName3 = scanner.next().trim();
		String secondFullName = (secondName1 + secondName2 + secondName3).trim();
		
		int secondNameSum = 0;
		for (int i = 0; i < secondFullName.length(); i++) {
			secondNameSum += secondFullName.charAt(i);
		}
		
		if(firstNameSum > secondNameSum){
			System.out.println(firstName1 + " " + firstName2 + " " + firstName3);
		} else if (secondNameSum > firstNameSum){
			System.out.println(secondName1 + " " + secondName2 + " " + secondName3);
		} else {
			System.out.println(firstName1 + " " + firstName2 + " " + firstName3 + "\n" + secondName1 + " " + secondName2 + " " + secondName3 );
		}
	}

}
