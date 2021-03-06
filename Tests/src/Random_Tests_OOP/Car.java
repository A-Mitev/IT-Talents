package Random_Tests_OOP;

public class Car {
	String model;
	static int maxSpeed;
	int gears;
	String color;
	boolean hasOwner;
	Person owner;
	boolean isSportCar;
	double price;

	Car(){
		this("", true, "");
	}
	
	Car(String model, boolean isSportCar, String color) {
		setModel(model);
		setColor(color);
		this.isSportCar = isSportCar;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null && !model.equals("")) {
			this.model = model;
		} else {
			this.model = "Model not confirmed";
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null && !color.equals("")) {
			this.color = color;
		} else {
			this.color = "Color is not confirmed";
		}
	}
	
	void printCarDetails(Car car){
		System.out.println(car.color);
		System.out.println(car.gears);
		System.out.println(car.isSportCar);
		System.out.println(car.maxSpeed);
		System.out.println(car.model);
		System.out.println(car.price);
		if (this.hasOwner){
		System.out.println("The owner is " +car.owner.name);
		System.out.println("THe owner age " + car.owner.age);
		}
		System.out.println();
	}
	
	void printOwnerDetails(Person owner) {
		if(this.hasOwner){
		System.out.println(owner.name);
		System.out.println(owner.age);
		System.out.println(this.model);
		System.out.println(this.color);
		System.out.println(this.maxSpeed);
		System.out.println(this.gears);
		System.out.println();
		} else {
			System.out.println("This car " + this.model + " has no owner");
		}
	}
}
