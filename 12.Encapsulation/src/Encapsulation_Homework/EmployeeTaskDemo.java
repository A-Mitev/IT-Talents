package Encapsulation_Homework;

public class EmployeeTaskDemo {
	public static void main(String[] args) {
		
		Employee stanoy = new Employee("Stanoy");

		Task cooking = new Task("Cooking", 1);
		stanoy.setCurrentTask(cooking);
		stanoy.setHoursLeft(5);
		stanoy.work();
		stanoy.showReport();
	}
}
