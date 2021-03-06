package bankTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client implements IClient {

	private String name;
	private double moneyInAccount;
	private double salary;
	private List<Deposit> deposits;
	public List<Deposit> getDeposits() {
		return deposits;
	}

	
	private List<Credit> credits;
	private Bank bank;

	public Client(String name, double salary, double moneyInAccount ) throws ClientNameException, InvalidSalaryException {
		this.setName(name);
		this.setSalary(salary);
		this.setMoneyInAccount(moneyInAccount);
	}

	@Override
	public void getCredit(double money, Credit credit) throws FaliralaBankaException {
		double monthPayments = 0;
		if (this.credits == null) {
			this.credits = new ArrayList<Credit>();
		}
		for (Credit c : credits) {
			monthPayments = monthPayments + c.getAnnualRate();
		}

		if (monthPayments <= this.getSalary() * 0.3) {
			if (this.getBank().getAvailableMoney() - money > this.getBank().getBankReserve()) {
				this.setMoneyInAccount(this.getMoneyInAccount() + money);
				this.getBank().setAvailableMoney(this.getBank().getAvailableMoney() - money);
				this.credits.add(credit);
				this.bank.addCredit(credit);

			}
		}

	}

	@Override
	public void makeDeposit(double money, Deposit deposit) throws FaliralaBankaException {
		double payments = 0;
		if (this.getMoneyInAccount() > 0 && this.getMoneyInAccount() >= money) {
			if (this.deposits == null) {
				this.deposits = new ArrayList<Deposit>();
			}
			this.setMoneyInAccount(this.getMoneyInAccount() - money);
			this.getBank().setAvailableMoney(this.getBank().getAvailableMoney() + money);
			this.getBank().setBankReserve(this.getBank().getBankReserve() + money * 0.9);
			this.deposits.add(deposit);
			this.bank.addDeposit(deposit);
		}
	}

	@Override
	public void payBankInterest() throws FaliralaBankaException {
		for (int credit = 0; credit < credits.size(); credit++) {
			credits.get(credit).setMoneyAvaylability(credits.get(credit).getMounthPayment());
			this.getBank().setAvailableMoney(this.getBank().getAvailableMoney() + credits.get(credit).getMounthPayment());
		}
	}
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws InvalidSalaryException {
		if (salary > 0){
			this.salary = salary;	
		} else {
			throw new InvalidSalaryException("Nqma lud da raboti i da mu vzimat pari za tova");
		}
		
	}
	
	
	
	// tozi getter ne go polzvam, samo kato upraznenie da ne vrushtam
	// directno List
	public List<Credit> getCredits() {
		return Collections.unmodifiableList(credits);
	}


	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		if(bank != null){
		this.bank = bank;
		}
	}

	public void setMoneyInAccount(double moneyInAccount) {
		this.moneyInAccount = moneyInAccount;
	}

	public double getMoneyInAccount() {
		return moneyInAccount;
	}

	@Override
	public String toString() {
		return "Client [name=" + name +  ", moneyInAccount=" + moneyInAccount + ", salary="
				+ salary + ", deposits=" + deposits + ", credits=" + credits + ", bank=" + bank + "]";
	}
	
	public void setDeposits(List<Deposit> deposits) {
		this.deposits = deposits;
	}

	public void setName(String name) throws ClientNameException {
		if(name != null & !name.equals("") && name.length() > 1){
		this.name = name;
		} else {
			throw new ClientNameException("CLient name must be first name and family name");
		}
	}


	

}
