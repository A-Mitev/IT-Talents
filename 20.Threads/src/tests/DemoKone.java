package tests;

import java.util.ArrayList;
import java.util.List;

public class DemoKone {
	private static final int NUMBER_OF_KONE = 10;

	public static void main(String[] args) {
		
		List<Thread> kone = new ArrayList<Thread>();
		
		for (int index = 0; index < NUMBER_OF_KONE; index++) {
			Kon kon;
			if (Math.random() > 0.5){
				kon = new Kon();
			} else {
				 kon = new KucKon();
			}
			
			Thread konThread = new Thread(kon, "Kon " + index);
			kone.add(konThread);
		}
		
		for (Thread kon : kone){
			kon.start();
		}
		
		
	}

}