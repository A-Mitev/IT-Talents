package Lambda;

public class ShooterDemo {
	public static void main(String[] args) {
		
		
		IShooter strelio = who -> System.out.println("Strelqm po " + who);

		strelio.shoot("OTO");
	}
 
}
