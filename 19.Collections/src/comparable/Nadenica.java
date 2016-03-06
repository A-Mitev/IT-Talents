package comparable;

public class Nadenica {
	
	private String marka;
	private String sudurzanie;
	private int price;
	
	
	public Nadenica(String marka, String sudurzanie, int price) {
		setMarka(marka);
		setSudurzanie(sudurzanie);
		setPrice(price);
	}

//	@Override
//	public boolean equals(Object obj) {
//		
//		return this.marka.equals(((Nadenica)obj).marka) && this.price == ((Nadenica)obj).price;
//	}
//	
//	@Override
//	public int hashCode() {
//	
//		return price * marka.hashCode();
//	}
	
	
	
	
	public void setMarka(String marka) {
		if(marka != null){
		this.marka = marka;
		} else {
		System.out.println("Napishi marka be!");
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nadenica other = (Nadenica) obj;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		if (price != other.price)
			return false;
		return true;
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

	@Override
	public String toString() {
		return "Nadenica [marka=" + marka + ", sudurzanie=" + sudurzanie + ", price=" + price + "]";
	}
	
	
	
	
}
