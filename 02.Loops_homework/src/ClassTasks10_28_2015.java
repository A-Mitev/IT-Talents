import java.util.Scanner;

public class ClassTasks10_28_2015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Taks 1 !!!

		// for (int i = -100; i <= 100; i++) {
		// System.out.println(i);
		// }
		//
		// for (int i = 100; i >= -100; i--) {
		// System.out.println(i);
		// }

		// Taks 2 !!!

		// for (int i = 0; i <= 50; i++) {
		// if(i % 2 == 0){
		// continue;
		// } else {
		// System.out.println(i);
		// }
		// }

		// for (int i = 51; i <= 100; i++) {
		// if (i % 2 == 0){
		// System.out.println(i);
		// }
		// }

		// Task 3

		// int a = scanner.nextInt();
		// int b = scanner.nextInt();
		//
		// for (int i = Math.min(a, b); i < Math.max(a, b); i++) {
		// if (i % 3 == 0){
		// System.out.print(i + ", ");
		// } else {
		// continue;
		// }
		// }
		// Task 4 !!!

		// int num = scanner.nextInt();
		// int devider = 2;
		// int maxDevider = (int)Math.sqrt(num);
		// boolean prime = true;
		//
		// while (prime && (devider <= maxDevider)) {
		// if (num % devider == 0) {
		// prime = false;
		// }
		// devider++;
		// }
		// if (prime) {
		// System.out.println("This number is Prime!");
		// } else {
		// System.out.println("This number is not Prime!");
		// }

		// Task 5 !!!

		// int num = scanner.nextInt();
		//
		// String binary = Integer.toBinaryString(num);
		// System.out.println(binary);
		//

		// Task 6!!!

		// int num = scanner.nextInt();
		// String binary = Integer.toBinaryString(num);
		// int binaryNum = Integer.parseInt(binary);
		//
		// System.out.println("Number of One bits " + Integer.bitCount(num));

		// Task 7 !!!

		// int A = scanner.nextInt();
		// int B = scanner.nextInt();
		// int C = scanner.nextInt();
		//
		// String binary = Integer.toBinaryString(A);
		// int binaryNum = Integer.parseInt(binary);
		//
		// int bitA = (binaryNum >> B) & 1; // 1 ili 0
		// int bitB = (binaryNum >> C) & 1;
		//
		// int temp = A;
		// if (bitA != bitB){
		// temp = temp ^ 1 << B;
		// }
		// if (bitB != bitA){
		// temp = temp ^ 1 << C;
		// }
		//
		// System.out.println(temp);

		// Task 8 !!!

		// int num = scanner.nextInt();
		//
		// for (int i = 1; i < num + 1; i++) {
		// for (int j = 0; j < num - i; j++) {
		// System.out.print(" ");
		// }
		// for (int j = 0; j < (i * 2) - 1 ; j++) {
		// System.out.print("*");
		//
		// }
		// System.out.println();
		// }

		// Task10

		 int num = scanner.nextInt();
		
		
		 for (int i = 1; i < num + 1; i++) {
		 for (int j = 0; j < num - i; j++) {
		 System.out.print(" ");
		 }
		 for (int j = 0; j < (i * 2) - 1 ; j++) {
		 System.out.print("*");
		 }
		 System.out.println();
		 }
		 for (int i = 0; i < num; i++) {
		 for (int j = 0; j < num -1; j++) {
		 System.out.print(" ");
		 }
		 System.out.print("*");
		
		 System.out.println();
		 }

		// Task in class for inverting numbers!!!

		// int num = 25;
		// int sum = 0;
		//
		// while (num > 0){
		// int digit = num % 10;
		// sum += digit;
		// num /= 10;
		// }
		// System.out.println(sum);

		int a = 1010101;
		int countOneBits = 0;

		while (a > 0) {
			int bit = a >> 1;
			if (bit == 1) {
				countOneBits++;
				a /= 2;
			}
		}
		System.out.println(countOneBits);

	}
}
