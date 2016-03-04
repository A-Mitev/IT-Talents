package task1Bank;

public class Deposit extends BankProduct{
	
	
	private double monthlyPayment;
	private double availability;

	
	public Deposit(double annualRate, int period, String name)
			throws InvalidDepositNameException {
		super(annualRate, period, name);
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		if(monthlyPayment > 0){
		this.monthlyPayment = monthlyPayment;
		}
	}

	public double getAvailability() {
		return availability;
	}

	public void setAvailability(double availability) {
		if(availability > 0){
		this.availability = availability;
		}
	}
	
	

}
