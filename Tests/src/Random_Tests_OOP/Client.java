package Random_Tests_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Client  {

	private String name;
	private double moneyInAccount;
	private double salary;
	
	

	
	
	

	public Client(String name, double salary, double moneyInAccount ) {
		this.setName(name);
		this.setSalary(salary);
		this.setMoneyInAccount(moneyInAccount);
	}

	


	
	
	// tozi getter ne go polzvam, samo kato upraznenie da ne vrushtam
	// directno List


	

	@Override
	public String toString() {
		return "Client [name=" + name + ", moneyInAccount=" + moneyInAccount + ", salary="
				+ salary + "]";
	}






	public void setName(String name) {
		if(name != null & !name.equals("") && (name.length() > 1)){
		this.name = name;
		} else {
			System.out.println(123);
		}
	}






	private void setSalary(double salary) {
		if(salary > 0){
			this.salary = salary;
		}
		
	}






	public void setMoneyInAccount(double moneyInAccount) {
		if (moneyInAccount > 0){
		this.moneyInAccount = moneyInAccount;
		}
	}

	
	
}



