package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.nextLine();	
		sc.close();
		String[] wArr = word.split("");
		
		Set<String> wordSet = new TreeSet<>();
		
		for (int i = 0; i < wArr.length; i++ ) {
			String letter = wArr[i];
			wordSet.add(letter);
		}
		
		System.out.println("\nCharacters in alphabetical order: " + wordSet);

	}

}
