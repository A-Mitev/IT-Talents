package Task_02;

import java.util.Scanner;

public class GSMDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter price for call in minutes.");
		double price = scanner.nextDouble();
		
		GSM nexus4 = new GSM();
		GSM xiaoMIRedMINote3 = new GSM();
		nexus4.price = price;
		
		System.out.println("Pease enter yout mobile number 08XXXXXXXX");
		nexus4.insertSimCard(scanner.next());
		
		System.out.println("Please enter the number you want to call: 08XXXXXXXX");
		xiaoMIRedMINote3.insertSimCard(scanner.next());
		
		nexus4.call(xiaoMIRedMINote3, 3);
		
		nexus4.printInfoForLastOutgoingCall();
		xiaoMIRedMINote3.printInfoForLastIncomingCall();
		
		System.out.println(nexus4.getSumForCall());
	}

}
