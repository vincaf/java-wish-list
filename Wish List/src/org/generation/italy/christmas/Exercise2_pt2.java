package org.generation.italy.christmas;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise2_pt2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String w = sc.next();
		sc.close();
		String[] wArr = w.split("");
		
		Map<String, Integer> wMap = new TreeMap<>();
		
		for (String letter : wArr) {
			int counter = 0;
			if (!wMap.containsKey(letter)) {
				counter = 1;
				wMap.put(letter, counter);
			} else {
				counter = wMap.get(letter) + 1;
				wMap.put(letter, counter);
			}
		}
		
		System.out.println("\nnumber of letters in the word:\n");
		System.out.println(wMap);

	}

}
