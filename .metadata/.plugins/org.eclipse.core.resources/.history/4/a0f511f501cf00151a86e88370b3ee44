package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueTest {
	
	public static void main(String[] args) {
		
		
		Koli lada = new Koli(1, "Rakia", 11, "Lada");
		Koli jiguli = new Koli(2, "Vodka", 123, "Jiguli");
		Koli opel = new Koli(3, "bezoloven", 456, "Opel");
		Koli volvo = new Koli(4, "sol", 554, "Volvo");
		Koli ford = new Koli(5, "zahar", 555, "Ford");
		
		Queue<Koli> garaz = new LinkedList<Koli>();
		
		garaz.offer(lada);
		garaz.offer(jiguli);
		garaz.offer(opel);
		garaz.offer(volvo);
		garaz.offer(ford);
		
		System.out.println("Pokazvam purviq za obrabotka " + garaz.peek());
		
		for(Iterator<Koli> it = garaz.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		
		while(!garaz.isEmpty()){
			System.out.println(garaz.poll());
		}
		
		
		
		
		
		
		
		
	}

}
