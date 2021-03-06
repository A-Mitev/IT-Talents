package Inheritance_HW;

public class Employee extends Person {

	// added constants
	private static final int MAXIMUM_ALLOWED_WORKING_HOURS = 8;
	private static final double OVERTIME_BOUNS_PAYMENT = 1.5;
	private static final int MINIMUN_AGE_FOR_BONUS_PAYMENT = 18;
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
		double currentPaymentPerHour = this.getDaySalary() / MAXIMUM_ALLOWED_WORKING_HOURS;

		if (this.getAge() < MINIMUN_AGE_FOR_BONUS_PAYMENT) {
			return additionalPayment;
		} else {

			additionalPayment = (currentPaymentPerHour * OVERTIME_BOUNS_PAYMENT) * hours;
		}
		return additionalPayment;
	}

	void showEmployeeInfo() {
		this.showPersonInfo();
		System.out.println("Salary per day (eight hours) - " + this.daySalary);

	}

}
