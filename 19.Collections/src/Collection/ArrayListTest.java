package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> pokupki = new ArrayList<>();
		Koli audi = new Koli(4, "diesel", 256321, "audi");
		System.out.println(audi.hashCode());
		ArrayList<Koli> vozila = new ArrayList<Koli>();
		
		vozila.add(new Koli(4, "benz", 22000, "nissan"));
		vozila.add(new Koli(2, "tok", 21215, "honda"));
		vozila.add(new Koli(3, "diesel", 20000, "skoda"));
		
		for (Koli auto : vozila){
			System.out.println(auto.getMarka());
		}
		
		System.out.println(vozila.contains(new Koli(4, "diesel", 20000, "skoda")));
		
		Collections.sort(vozila,(k1, k2) -> k1.getDoors() - k2.getDoors());
		
		for(Koli auto : vozila){
			System.out.println(auto);
		}
		
		
		
		
		pokupki.add("domati");
		pokupki.add("bidoni");
		pokupki.contains("domati");
		pokupki.add(2, "morkovi");
		pokupki.add("bidoni");
		
		System.out.println(vozila.hashCode());
		
		for(Iterator<String> it= pokupki.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		
//		for(String pokupka : pokupki){
//			System.out.println(pokupka);
//		}
//		System.out.println(pokupki.contains("domati"));
//		

	}
}
