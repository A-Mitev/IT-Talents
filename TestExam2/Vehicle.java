
public abstract class Vehicle {

	private String model;
	private Vinetka vinetka;
	private int year;

	public abstract void setColor();
	
	public Vinetka getVinetka() {
		return vinetka;
	}

	public void setVinetka(Vinetka vinetka) {
		if (vinetka != null) {
			this.vinetka = vinetka;
		}
	}
}
