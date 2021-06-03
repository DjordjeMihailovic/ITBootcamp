package Loops;

import java.util.Scanner;

public class DoWhile2Domaci {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Upisite broj");
			int x = sc.nextInt();
			int t = 0;
			int y = x;
			int z = 0;
					
			while  ( x > 0 ) {
			t = x % 10;		
			x = x / 10;
			z =  (z * 10) + t;
		} 	
			if (z == y) {
				System.out.println("Unet broj je palindrom");
			}
			else {
				System.out.println("Unet broj nije palindrom");
			}
	}

}
