package CarDemo;

public class CarDemo {
	public static void main(String[] args) {

		Car Skoda = new Car();
		Skoda.maxSpeed = 220;
		Skoda.color = "silver";
		Skoda.model = "Rapid";
		
		System.out.println("The color of my Skoda " + Skoda.color + "and it has max speed of " + Skoda.maxSpeed);
		
		Person Alex = new Person();
		Alex.name = "Alex";
		Alex.age = 32;
		Skoda.owner = Alex;
		
		System.out.println("The owner of my Skoda is " + Skoda.owner.name + ", he is " + Skoda.owner.age + " years old.");
		
		Person Pepa = new Person();
		Pepa.name = "Pepa";
		Pepa.age = 21;
		Alex.friend = Pepa;
		
		System.out.println("The friend ot Alex is " + Alex.friend.name + ", she is " + Pepa.age + " years old.");
		
		Skoda.printOwnerDetails();

	}
}
