import java.util.Arrays;

public class Demo {

	private static final int NUMBER_OF_RANDOM_VEHICLES = 200;
	private static final int NUMBER_OF_RANDOM_DRIVERS = 20;

	public static void showDriversInfo(Driver[] drivers) {
		for (Driver driver : drivers) {
			System.out.println(driver);
		}
	}

	public static Vehicle[] generateRandomVehicles() {
		Vehicle[] randomVehicles = new Vehicle[199];
		int index = 0;
		for (int numberOfObject = 1; numberOfObject < NUMBER_OF_RANDOM_VEHICLES; numberOfObject++) {
			int randomNumber = (int) Math.random();
			if (randomNumber > 0 && randomNumber < 0.3) {
				randomVehicles[index] = new Car();
				index++;
			} else if (randomNumber > 0.4 && randomNumber < 0.7) {
				randomVehicles[index] = new Bus();
				index++;
			} else {
				randomVehicles[index] = new Truck();
				index++;
			}
		}
		return randomVehicles;
	}

	public static void main(String[] args) {

		GasStation gasStation = new GasStation();
		System.out.println("Number of vinetki in the gas station: " + gasStation.getVinetkiForSale().length);

		Driver[] drivers = new Driver[19];
		int index = 0;
		for (int numberOfObject = 1; numberOfObject < NUMBER_OF_RANDOM_DRIVERS; numberOfObject++) {
			drivers[index] = new Driver();
			index++;
		}

		// Driver Ivan = new Driver();
		// Ivan.setName("Ivanov");
		// Ivan.setMoney(300);
		// Ivan.setGasStation(gasStation);

		Vehicle[] randomVehicles = generateRandomVehicles();

		showDriversInfo(drivers);

		for (Vinetka vinetka : gasStation.getVinetkiForSale()) {
			System.out.println(vinetka);
		}
	}

}
