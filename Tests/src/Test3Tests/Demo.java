package Test3Tests;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		String s = "Plovdiv";
		
		for(City str : City.values()){
			if(str.equals(City.valueOf(s)))
			System.out.println(str.equals(City.valueOf(s)));
		}
		
		System.out.println(City.valueOf(s));
		
		
		
		Client testov = new Client("Ale",City.Sofia, 23);
		
		System.out.println(testov);
		
		System.out.println(Arrays.toString(City.values()));
	}
}
