package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		TreeSet<String> testovSet = new TreeSet<String>();
		
		testovSet.add("Morkovi");
		testovSet.add("Limoni");
		testovSet.add("Kivi");
		testovSet.add("Dinq");
		testovSet.add("Pupesh");
		testovSet.add("Limoni");
		
		System.out.println(testovSet.contains("Morkovi"));
		
		
		for(Iterator<String> it = testovSet.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		
		
		
		
	}
}
