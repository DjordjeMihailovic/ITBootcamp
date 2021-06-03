package Loops;

import java.util.Scanner;

public class DoWhile1Domaci {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Upisite sa koliko novca raspolazete:");
		int x = sc.nextInt();	
		
		
		while ( x > 89 ) {
			System.out.println("Upisite cenu poklona:");
			int z = sc.nextInt();	
			if ((x - z) < 89 ) {
				break;
			}
			x = x - z;
			System.out.println("Ostalo je jos:" +x+ "dinara");
		}
		System.out.println("Nadji posao u IT-u!");		
	}	

}
