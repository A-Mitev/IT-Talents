package CarDemo;
public class CarDemo {
	public static void main(String[] args) {
		
	Car Skoda = new Car();
	Car Opel = new Car();
	
	Skoda.color = "silver";
	Skoda.maxSpeed = 220;
	
	Opel.color = "white";
	Opel.maxSpeed = 190;
	Skoda.owner.name = "Alex";
	//Skoda.owner.age = 22;
	
	System.out.println("Skoda color" + " " + Skoda.color);
	System.out.println("Skoda owner is " + Skoda.owner.name);
		
	}
}

