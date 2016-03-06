package comparable;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {
	
	public static void main(String[] args) {
		
		Nadenica leki = new Nadenica("Leki", "kajma", 6);
		Nadenica tandem = new Nadenica("Tandem", "Meso", 9);
		Nadenica boni = new Nadenica("Tandem", "pasta", 9);
		
//		System.out.println(tandem.equals(new Nadenica("", "test", 9)));
		
		HashSet<Nadenica> vitrina = new HashSet<Nadenica>();
		vitrina.add(leki);
		vitrina.add(tandem);
		vitrina.add(boni);
		
		for(Iterator<Nadenica> it = vitrina.iterator(); it.hasNext(); ){
			System.out.println(it.next());
		}
		
		System.out.println(vitrina.contains(new Nadenica("Tandem", "pasta3", 9)));
	}
}
