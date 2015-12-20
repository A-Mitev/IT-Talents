package Random_Tests_OOP;

public class CarDemo {
	public static void main(String[] args) {

		Car skoda = new Car("Skoda", true, "silver");
		Car audi = new Car("Audi", false, "red");
		Car trabi = new Car();
		trabi.model = "Trabi";
		
		skoda.maxSpeed = 220;
		skoda.gears = 5;
		
		Person alex = new Person();
		alex.name = "Alex";
		alex.age = 29;
		
		skoda.owner = alex;
		
		Person mitko = new Person();
		mitko.name = "Mitko";
		mitko.age = 33;
		audi.owner = mitko;
		
		Person slavi = new Person();
		slavi.name = "Slavi";
		slavi.age = 44;
		alex.friend = slavi;
		audi.hasOwner = true;
		
		//alex.printPErsonDetails(alex);
	    //audi.printCarDetails(audi);
		

		skoda.hasOwner = true;
	    skoda.printOwnerDetails(alex);
		
		//trabi.printCarDetails(trabi);
	}
}
