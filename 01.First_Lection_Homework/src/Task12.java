import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int day = scanner.nextInt();
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		boolean leapYear = false;
		boolean wrongDate = true;

		while (wrongDate) {
			if (year % 4 == 0) {
				leapYear = true;
			}
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leapYear = true;
				} else {
					leapYear = false;
				}
			}
			if ((day < 0 || day > 31) || (month < 0 || month > 12) || (year < 0)
					|| (month == 2 && day > 28 && !leapYear)) {
				wrongDate = true;
			} else if ((day == 31) && ((month == 4) || (month == 6) || (month == 9) || month == 11)) {
				wrongDate = true;
			} else {
				wrongDate = false;
				break;
			}

			System.out.println("Invalid data, please repeat with correct data!");
			day = scanner.nextInt();
			month = scanner.nextInt();
			year = scanner.nextInt();
		}

		/*
		 * Do tuk validiram vhodnite danni kato celta e pri vsichki dopustimi
		 * greshki programata da ostane aktivna i da pita otnovo.
		 */

		if (day == 29 && month == 2 && leapYear) {
			month++;
			day = 1;
		} else

		if (day == 28 && month == 2 && !leapYear) {
			month++;
			day = 1;
		} else

		if (day == 30) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day++;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 1;
				if (month == 12) {
					month = 1;
					year++;
				} else {
					month++;
				}
				;
				break;
			}
		} else if (day == 31) {
			day = 1;

			if (month == 12) {
				month = 1;
				year++;
			} else {
				month++;
			}
		} else {
			day++;
		}
		System.out.println(day + " " + month + " " + year);
	}
}
