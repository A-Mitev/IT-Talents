import java.util.Arrays;

public class Driver implements IDriver {

	private static final int VINETKI_COUNT = 100;
	private String name;
	private Vehicle[] vehicles;
	private double money;
	private GasStation gasStation;

	@Override
	public void buyVinetka(int numberOfVehicle, int term) {
		Vinetka vinetka = (Vinetka) this.gasStation.sellVinetka(this.vehicles[numberOfVehicle], "Year");
		this.vehicles[numberOfVehicle].setVinetka(vinetka);

	}

	@Override
	public void buyVinetka() {
		Vehicle car = new Car();
		Vinetka vinetka = (Vinetka) this.gasStation.sellVinetka(car, "Month");
		this.money -= vinetka.getPrice();
		car.setVinetka(vinetka);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if (money >= 0) {
			this.money = money;
		}
	}

	public GasStation getGasStation() {
		return gasStation;
	}

	public void setGasStation(GasStation gasStation) {
		if (gasStation != null) {
			this.gasStation = gasStation;
		}
	}

	@Override
	public Vinetka[] expiredVinetki() {
		// String cuurentDate = "10.01";
		// Vehicle[] vehiclesWithExpredVinetki = new Vehicle[VINETKI_COUNT];
		// for(Vehicle vehicle: this.vehicles){
		// String tempTerm = vehicle.getVinetka().getTerm();
		// if(tempTerm.equals("Day")){
		//
		// }
		// if(tempTerm.equals("Month")){
		//
		// }
		// if(tempTerm.equals("Year")){
		//
		// }
		// }
		return null;
	}

	@Override
	public String toString() {

		return "Driver's name: " + this.name + " money: " + this.getMoney() + " vehicles count: "
				+ this.getVehicles().length;

	}

	public Vehicle[] getVehicles() {
		return this.vehicles = Arrays.copyOf(this.vehicles, this.vehicles.length);
	}

}
