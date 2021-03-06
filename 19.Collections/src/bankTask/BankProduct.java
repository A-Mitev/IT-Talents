package bankTask;

public abstract class BankProduct {

	private static final int MAX_AVAILABILITY_FOR_PRODUCT = 60;
	private static final int MIN_AVAILABILITY_FOR_PRODUCT = 1;
	private static final int THE_LENGTH_OF_IBAN = 20;
	private String iban = "ITTS";
	private double annualRate;
	private int period;
	private String name;

	public BankProduct(double annualRate, int period, String name) throws InvalidDepositNameException {
		this.getAnnualRate();
		this.setPeriod(period);

		this.setName(name + generateIban());

	}

	private String generateIban() {
		for (int index = 0; index < (THE_LENGTH_OF_IBAN - iban.length()); index++) {
			this.iban += (int) (Math.random() * 10);
		}
		return this.iban;
	}

	public int getPeriod() {
		return period;
	}

	public double getAnnualRate() {
		return annualRate;
	}

	public void setPeriod(int period) {
		if (period >= MIN_AVAILABILITY_FOR_PRODUCT && period <= MAX_AVAILABILITY_FOR_PRODUCT) {
			this.period = period;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidDepositNameException {
		if (name != null && !name.equals("") && name.length() > 3) {
			this.name = name;
		} else {
			throw new InvalidDepositNameException("The name must be at least 4 symbols");
		}
	}

	@Override
	public String toString() {
		return "BankProduct [iban= " + iban + ", annualRate= " + annualRate + ", period=" + period + ", name=" + name
				+ "]";
	}

}
