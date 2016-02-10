package Exam;

import java.util.Arrays;

public class Driver {
	private String name;
	private Vehicle[] vehicle;
	private int money;
	private GasStation gasStation;
	
	
	public void buyVinetka() {
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			System.out.println("Wrong name");
		}
	}

	public Vehicle[] getVehicle() {
		return Arrays.copyOf(vehicle, vehicle.length);
	}

	public void setVehicle(Vehicle[] vehicle) {
		this.vehicle = Arrays.copyOf(vehicle, vehicle.length);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money > 0) {
			this.money = money;
		} else {
			System.out.println("Wrong value for money!");
		}
	}

	public GasStation getGasSttation() {
		return gasStation;
	}

	public void setGasSttation(GasStation gasSttation) {
		if (gasSttation != null)
			this.gasStation = gasSttation;
	}
}
