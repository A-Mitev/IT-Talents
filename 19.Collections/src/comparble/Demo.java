package comparble;

public class Demo {
	
	public static void main(String[] args) {
		
		Nadenica leki = new Nadenica("Leki", "kajma", 6);
		Nadenica tandem = new Nadenica("Tandem", "Meso", 9);
		Nadenica boni = new Nadenica("Boni", "pasta", 4);
		
		System.out.println(tandem.equals(new Nadenica("", "test", 9)));
	}
}
