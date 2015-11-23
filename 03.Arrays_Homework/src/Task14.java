public class Task14 {
	public static void main(String[] args) {

		double[] array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };

		int numbersCount = 0;

		for (int index = 0; index < array.length; index++) {		// Cikul za izchislenie na goleminata na vroiq masiv.
			if ((array[index] > -3.00) && (array[index] < 3.00)) {
				numbersCount++;
			}
		}

		int indexRaise = 0;                            // Promenliva po koqto da se vodi dobavqneto na novi elementi za da se izbegnat nulite.
		double[] newArray = new double[numbersCount];
		for (int index = 0; index < array.length; index++) {
			if ((array[index] > -3.00) && (array[index] < 3.00)) {
				newArray[indexRaise] = array[index];
				indexRaise++;
			}
		}

		for (int index = 0; index < newArray.length; index++) {
			if (index == newArray.length - 1) {
				System.out.print(newArray[index]);
				break;
			} else {
				System.out.print(newArray[index] + "; ");
			}
		}

	}

}
