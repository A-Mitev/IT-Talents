package DateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("TOday is " + date);
		LocalDate date1 = LocalDate.now();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
		System.out.println(DateFormat.getTimeInstance().format(date));
		Period five = Period.ofDays(5);
		System.out.println(date1.plus(five));
		
	}
}