package Domaci;

import java.util.Scanner;

public class Funkcije1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int niz[] = new int[3];
		System.out.println("Upisite 3 elementa niza");
		int x = 0;
		while (x < niz.length) {
			niz[x] = sc.nextInt();
			x++;
		}
		System.out.println(Najmanji(niz));
		
	}
	public static int Najmanji(int[] niz1) {
	 
		int x = 0;
		int y = 1;
		int pomocnax = 0;
		int pomocnay = 0;
		int x1 = 0;
		int y1 = 1;		
		
		while(y1 < niz1.length) {
				x = x1;
				y = y1;
			
			while (y < niz1.length) {
				if (niz1[x] > niz1[y]) {
				pomocnay = niz1[y];
				pomocnax = niz1[x];
				niz1[y] = pomocnax;
				niz1[x] = pomocnay;							
			}				
				y++;
		}
				x1++;
				y1++;
		}
		return niz1[0];
	}
}
