package CarDemo;

public class Car {
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;

	Person owner;

	void printOwnerDetails() {
		System.out.println(owner.name + " " + owner.age + " " + maxSpeed + " " + model);
	}

}
