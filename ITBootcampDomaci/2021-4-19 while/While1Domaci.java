package Loops;

import java.util.Scanner;

public class While1Domaci {

	public static void main(String[] args) {
		
	
		System.out.println("Upisite broj");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	
		int z = 0;
	
		while (x >= 0) {
			
			if (x < 0) {
				break;
			}
			z = z + x;
			System.out.println("Zbir:" +z);			
			x = sc.nextInt();			
			}
			System.out.println("Pogresan unos: negativan broj");
		} 
		
	}
