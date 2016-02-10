package Exam;

public class BusVinetka extends Vinetka implements IVinetka {

	@Override
	public int attached() {
		return 20;
	}
	
	@Override
	public int getPrice() {
		//return super.getPrice();
		return 9;
	}
	// tuk zadavam standartnata cena kato se nadqvam 
	// v demoto kato vikna BusVinetka.getMonthPrice da se 
	// oburne purvo kum tozi getPrise i posle da se umnozi
	
}
