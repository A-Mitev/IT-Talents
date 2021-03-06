package WordCountingTask;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class WordCounting {
	public static void main(String[] args) throws MalformedURLException, IOException {
		Long startTime = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(new URL("https://archive.org/stream/warandpeace030164mbp/warandpeace030164mbp_djvu.txt").openStream());

		StringBuilder builder = new StringBuilder("");
		while(scanner.hasNextLine()){
			builder.append(scanner.nextLine());
		}
		
		String[] words = builder.toString()
				.replaceAll("[^a-zA-Z]", " ")
				.toLowerCase()
				.split("\\s+");
		
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		
		
		 Long endTime =System.currentTimeMillis();
		 System.out.println((endTime - startTime));
		
		 HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		 
		 for(String word : words){
			 if(!wordsCount.containsKey(word)){
				 wordsCount.put(word, 1);
			 } else {
				 wordsCount.put(word, wordsCount.get(word) + 1);
			 }
		 }
		 
		 ArrayList<String> wordsForSorting = new ArrayList<String>();
		 
		 wordsForSorting.addAll(wordsCount.keySet());
		 
		 Collections.sort(wordsForSorting, (word1, word2) -> wordsCount.get(word2) - wordsCount.get(word1));
		 
		
		 for(String word : wordsForSorting){
			 System.out.println("Dumata " + "\"" + word + "\"" + " se sreshta " + wordsCount.get(word));
		 }
		
		
		
		
	}
}
