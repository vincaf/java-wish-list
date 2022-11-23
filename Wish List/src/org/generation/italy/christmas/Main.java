package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> wishList = new ArrayList<>();
		boolean goNext = true;
		
		while(goNext) {
			System.out.print("Enter a new wish: ");
			String wish = sc.next();
			wishList.add(wish);
			
			System.out.println("\nThe list is long: " + wishList.size() );
			System.out.print("\nDo you want to enter a new wish [true/false]? ");
			goNext = sc.nextBoolean();
			System.out.println("");
		}
		
		sc.close();
		
		wishList.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("\n----------\n");
		System.out.println("Wish list in alphabetical order: " + wishList);
		
		wishList.sort(new StringComparator());
		System.out.println("Wish list sorted by vowels: " + wishList);
		
	}
	
	public static class StringComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			int v1 = 0;
			int v2 = 0;

			for (int i = 0; i < o1.length(); i++) {
				if (o1.charAt(i) == 'a' || o1.charAt(i) == 'e' || o1.charAt(i) == 'i' || o1.charAt(i) == 'o'
						|| o1.charAt(i) == 'u') {
					v1++;
				}
			}

			for (int i = 0; i < o2.length(); i++) {
				if (o2.charAt(i) == 'a' || o2.charAt(i) == 'e' || o2.charAt(i) == 'i' || o2.charAt(i) == 'o'
						|| o2.charAt(i) == 'u') {
					v2++;
				}
			}

			return v2 - v1;
		}

	}
}
