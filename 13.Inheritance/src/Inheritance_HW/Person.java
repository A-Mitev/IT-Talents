package Inheritance_HW;

public class Person {

	private String name;
	private int age;
	private boolean isMale;

	Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		setMale(isMale);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			this.name = "Invalid name, must be defined correctly";
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Wrong value for age");
			this.age = 0;
		}
	}

	public boolean getIsMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	void showPersonInfo() {
		System.out.println(this.getName() + " e obect ot " + this.getClass());
		System.out.println("Name - " + this.getName());
		System.out.println("Age - " + this.getAge());
		System.out.print("Gender - ");
		if (this.getIsMale()) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
	}
}
