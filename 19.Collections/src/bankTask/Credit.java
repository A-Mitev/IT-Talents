package bankTask;

public class Credit extends BankProduct{
	
	private double mounthPayment;
	private double moneyAvaylability;
	
	
	
	public Credit(double annualRate, int period, String name)
			throws InvalidDepositNameException {
		super(annualRate, period, name);
	}


	public double getMounthPayment() {
		return mounthPayment;
	}


	public void setMounthPayment(double mounthPayment) {
		if(mounthPayment > 0){
		this.mounthPayment = mounthPayment;
		}
	}


	public double getMoneyAvaylability() {
		return moneyAvaylability;
	}
	
	//nqma proverka za polozitelno zaradi vuzmoznostta da e otricatelna stojnost
	public void setMoneyAvaylability(double moneyAvaylability) {
		this.moneyAvaylability = moneyAvaylability;
	}
	
	
	

	

}
