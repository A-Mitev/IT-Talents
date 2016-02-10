package Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2Letters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter some text: ");
		StringBuilder sBuilder = new StringBuilder().append(scanner.nextLine());
		
		
		String[] userInput = sBuilder.toString().toLowerCase().replaceAll("[^a-z]", "").split("");
		
		System.out.println(Arrays.toString(userInput));
		Map<String, Integer> letterBag = new HashMap<>();
		for (String letter : userInput) {
			if (!letterBag.containsKey(letter)) {
				letterBag.put(letter, 1);
			} else {
				letterBag.put(letter, letterBag.get(letter) +1);  // tuk bi trqbvalo da se seshta davzeme valueto i da dobavi 1.
			}
		}
		System.out.println(letterBag); // zamoq iznenada syso-to raboti i to printira gotino :)
		
		ArrayList<String> lettersForSorting = new ArrayList<String>(); 
		lettersForSorting.addAll(letterBag.keySet());
		
		Collections.sort(lettersForSorting); // Ne pozela da sortira Map i mi predlozi da se probvam s List zatova go napravih gore.
		
		System.out.println(lettersForSorting);
	}
}