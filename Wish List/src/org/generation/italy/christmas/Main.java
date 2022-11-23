package org.generation.italy.christmas;

import java.util.ArrayList;
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
		System.out.println("Wish list: " + wishList);
		
	}

}
