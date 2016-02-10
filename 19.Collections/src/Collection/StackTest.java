package Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		Stack<Koli> testvamSIStack = new Stack<Koli>();
		
		Koli lada = new Koli(1, "Rakia", 11, "Lada");
		Koli jiguli = new Koli(2, "Vodka", 123, "Jiguli");
		Koli opel = new Koli(3, "bezoloven", 456, "Opel");
		
		testvamSIStack.push(lada);
		testvamSIStack.push(jiguli);
		testvamSIStack.push(opel);
		testvamSIStack.push(new Koli(4, "gaz", 4445, "Tata"));
		testvamSIStack.push(new Koli(5, "air", 999, "tesla"));
		testvamSIStack.push(new Koli(6, "shits", 222, "bosch"));
		
		System.out.println(testvamSIStack.size());
		
		System.out.println("Eto gledam " + testvamSIStack.peek().getDoors());
		
		for(Iterator<Koli> it = testvamSIStack.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		
		
		
		while (!testvamSIStack.isEmpty()){
			System.out.println(testvamSIStack.pop());
		}
	}

}
