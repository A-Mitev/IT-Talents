package Inheritance_HW;

public class Employee extends Person {

	private double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			this.daySalary = 0;
		}
	}

	double calculateOvertime(double hours) {
		if(hours < 0){
			System.out.println("Wrong value for hours");
			return 0;
		}
		double additionalPayment = 0;
		double currentPaymentPerHour = this.getDaySalary() / 8;

		if (this.getAge() < 18) {
			return additionalPayment;
		} else {

			additionalPayment = (currentPaymentPerHour * 1.5) * hours;
		}
		return additionalPayment;
	}

	void showEmployeeInfo() {
		System.out.println(this.getName() + " e obect ot " + this.getClass());
		this.showPersonInfo();
		System.out.println("Salary per day (eight hours) - " + this.daySalary);

	}

}
