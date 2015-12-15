package Task_02;

public class Call {

//	private double priceForAMinute;
	double priceForAMinute;
	GSM caller;
	GSM receiver;
	int duration;

	Call(double price) {
		if(price >= 0){
			this.priceForAMinute = price;
		} else {
			System.out.println("Price must be with positive value.");
		}
		
	}
	
//	public void setPriceForAMinute(double priceForAMinute) {
//		if (priceForAMinute >= 0) {
//			this.priceForAMinute = priceForAMinute;
//		} else {
//			System.out.println("Price must be with positive value.");
//		}
//	}
//
//	public double getPriceForAMinute() {
//		return priceForAMinute;
//	}

	
}
