import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[scanner.nextInt()]; 		 // vuvezdame prez konzolata kolko da e golqm masiva.
		int arraySize = array.length; 					 // deklariram promenliva koqto pazi goleminatana masiva. Shteq polzvam za obrushtane na stojnostite.
		boolean specular = false;

		for (int index = 0; index < array.length; index++) {         // pulnq masiva s chisla.
			array[index] = scanner.nextInt();
		}

		for (int index = 0; index < array.length / 2; index++) {     // cikula e do sredata na masiva za da sravnq purvata ivrotata polovina.
			if ((array[index] == array[arraySize - 1])) {      // ako purviq index == na posledniq 
				specular = true;
				arraySize--;                             // namalqm promenlivata za da vzema chisloto na predpolsedniq index
				continue;
			} else {
				specular = false;
				break;
			}
		}
		
		if (array.length == 1){
			specular = true;
		}
		System.out.println("Is the array specular ? =  " + specular);
	}
}
