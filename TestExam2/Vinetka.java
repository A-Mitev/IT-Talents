
public abstract class Vinetka {

	private String date;
	private String color;
	private String term;
	private double price;

	abstract int putOnGlass();

	double getPrice() {
		return this.price;
	}

	double getPriceForMonth() {
		return this.getPrice() * 10;
	}

	double getPriceForYear() {
		return getPriceForMonth()*6;
	}

	public String getTerm() {
		return term;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Price: " + this.getPrice() + " Color: " + this.getColor();
	}

}
