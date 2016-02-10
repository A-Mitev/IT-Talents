package Inheritance_HW;

public class Demo {

	private static final int HOURS_FOR_BONUS_PAYMENT = 2;

	public static void main(String[] args) {

		Person[] peoples = new Person[10];

		Student alex = new Student("Alex", 22, true, 4.5);
		Employee pesho = new Employee("Pesho", 32, true, 550);
		Employee gosho = new Employee("Gosho", 33, true, 50);
		Person mimi = new Person("Mariq", 21, false);
		Person emil = new Person("Emil", 23, true);
		Person stavri = new Person("Stavri", 43, true);
		Person rumen = new Person("Rumen", 19, true);
		Employee kalina = new Employee("Kalina", 36, false, 700);
		Student eli = new Student("Eli", 22, false, 5.5);
		Employee gospodin = new Employee("Gospodin", 33, true, 50);

		peoples[0] = alex;
		peoples[1] = pesho;
		peoples[2] = gosho;
		peoples[3] = mimi;
		peoples[4] = emil;
		peoples[5] = stavri;
		peoples[6] = rumen;
		peoples[7] = kalina;
		peoples[8] = eli;
		peoples[9] = gospodin;

		for (int index = 0; index < peoples.length; index++) {
			
			if (peoples[index] instanceof Student) {
				((Student) peoples[index]).showStudentInfo();
				System.out.println();
				continue;
			}
			if (peoples[index] instanceof Employee) {
				((Employee) peoples[index]).showEmployeeInfo();
				System.out.println();
				continue;
			}
			if (peoples[index] instanceof Person) {
				peoples[index].showPersonInfo();
				System.out.println();
			}
			
		}

		for (int index = 0; index < peoples.length; index++) {
			if (peoples[index] instanceof Employee) {
				System.out.println(((Employee) peoples[index]).getName()
						+ " is Employee. His additional payment for two hours overtime is -  "
						+ ((Employee) peoples[index]).calculateOvertime(HOURS_FOR_BONUS_PAYMENT));
			}
		}

	}

}
