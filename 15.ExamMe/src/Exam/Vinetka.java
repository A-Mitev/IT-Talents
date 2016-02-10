package Exam;
public abstract class Vinetka implements IVinetka{
	// abstrakten klas za da ne implementiram metoda
	// za zalepqne kojto shte polzvam v podklasovete
	
	private String date;
	private String color;
	private int price;
	
	public int getPrice(){
		return this.price;
	}

	@Override
	public int getPriceForMounth() {
		return getPrice() * 10;
	}

	@Override
	public int getPriceForYear() {
		return getPriceForMounth() * 6;
	}
	
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		if(color != null){
			this.color = color;
		}
	}
	
	
}
