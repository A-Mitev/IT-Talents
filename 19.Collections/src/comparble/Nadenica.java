package comparble;

public class Nadenica {
	
	private String marka;
	private String sudurzanie;
	private int price;
	
	
	public Nadenica(String marka, String sudurzanie, int price) {
		setMarka(marka);
		setSudurzanie(sudurzanie);
		setPrice(price);
	}

	@Override
	public boolean equals(Object obj) {
		
	
		return this.marka.equals(((Nadenica)obj).marka) && this.price == ((Nadenica)obj).price;
	}
	

	
	
	public void setMarka(String marka) {
		if(marka != null){
		this.marka = marka;
		}
		System.out.println("Napishi marka be!");
	}


	public void setSudurzanie(String sudurzanie) {
		if(sudurzanie != null){
		this.sudurzanie = sudurzanie;
		}
	}


	public void setPrice(int price) {
		if(price > 0){
		this.price = price;
		}
	}
	
	
	
	
}
