public class Task14 {
	public static void main(String[] args) {

		double[] array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };

		int numbersCount = 0;

		for (int i = 0; i < array.length; i++) {		// Cikul za izchislenie na goleminata na vroiq masiv.
			if ((array[i] > -3.00) && (array[i] < 3.00)) {
				numbersCount++;
			}
		}

		int indexRaise = 0;                            // Promenliva po koqto da se vodi dobavqneto na novi elementi za da se izbegnat nulite.
		double[] newArray = new double[numbersCount];
		for (int i = 0; i < array.length; i++) {
			if ((array[i] > -3.00) && (array[i] < 3.00)) {
				newArray[indexRaise] = array[i];
				indexRaise++;
			}
		}

		for (int i = 0; i < newArray.length; i++) {
			if (i == newArray.length - 1) {
				System.out.print(newArray[i]);
				break;
			} else {
				System.out.print(newArray[i] + "; ");
			}
		}

	}

}
