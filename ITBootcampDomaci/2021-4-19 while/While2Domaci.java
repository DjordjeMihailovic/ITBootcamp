package Loops;

import java.util.Scanner;

public class While2Domaci {

	public static void main(String[] args) {
		System.out.println("Upisite broj");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	
		int z = 0;
		
		while (z < x ) {
			z++;
			System.out.println("Laku noc!");	
		}

	}

}
