import java.util.Scanner;

public class Class_task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// int month = scanner.nextInt();
		//
		// switch (month){
		// case 1:
		// case 3:
		// case 5:
		// case 7:
		// case 9:
		// case 11:
		// System.out.println("This mounth has 30 days");
		// break;
		// case 2:
		// System.out.println("This mounth has 29 days");
		// break;
		// case 4:
		// case 6:
		// case 8:
		// case 10:
		// case 12:
		// System.out.println("This mounth has 31 days.");
		//
		// default:
		// System.out.println("Wrong input");

		// int start = 1;
		// int end = 100;
		//
		// while (start <= end){
		// System.out.println(start);
		// start ++;

		// int start = 50;
		// int end = 3;
		// while (start >= end){
		// System.out.println(start);
		// start--;

		// int start = 10;
		// int end = -10;
		//
		// while (start >= end){
		// System.out.println(start);
		// start -=4;
		// }

		// int start = 2;
		// while (start <= 50){
		// System.out.println(start);
		// start += 2;
		// }
		// int start = 14;
		//
		// while (start < 72){
		// System.out.println(start);
		// start += 14;

		int start = 5;
		int n = scanner.nextInt();
//		if (n < start) {
//			System.out.println("Wrong input!");
//			System.exit(1);
//		} else {
			do {
				System.out.println(start);
				start++;
			} while (start <= n );
		}
	}

