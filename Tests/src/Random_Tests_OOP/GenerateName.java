package Random_Tests_OOP;

import java.util.HashSet;
import java.util.Set;


public class GenerateName {
	private static String iban = "iban";
	private static final int THE_LENGTH_OF_IBAN = 22;
	
	private static  String generateIban() {
		for (int index = 0; index < 5; index++) {
			iban += ((int) (Math.random() * 10));
		}
		return iban;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(generateIban());
//	String name = "Ivan";
//	
//	int a = 33424;
//	for (int index = 0; index < 3; index++) {
//		name += a;
//		System.out.println(name);
//	}
		
		Set<Client> clients = new HashSet<Client>();
		for (int index = 0; index < 2; index++) {
			String name = "Client";
			clients.add(new Client((name + index), (Math.random() * 2000), (Math.random()* 500)));
		}
		
		for(Client client : clients){
			System.out.println(client);
		}
	}
	

}
