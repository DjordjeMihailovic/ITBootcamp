package Domaci;

import java.util.Arrays;
import java.util.Scanner;

public class Nizovi1 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite velicinu niza");
			int z = sc.nextInt();
			int niz[] = new int[z];
			int UcitanNiz[] = UcitavanjeNiza(niz);
			Palindrom(UcitanNiz);
		}
			
			public static int[] UcitavanjeNiza(int[] niz) {
				Scanner sc = new Scanner(System.in);
				int x = 0;
				while (x < niz.length) {
					System.out.println("Unesite " + (x + 1) + " element niza");
					niz[x] = sc.nextInt();
					x++;					
				}
				return niz;	
			}
		public static void Palindrom(int[] niz) {
			int pomocnaElement = 0;
			int pomocna[] = niz;
			int x = 0;
			int y = niz.length - 1;
			while (x < y) {
				pomocnaElement = niz[x];
				niz[y] = niz[x];
				niz[y] = pomocnaElement;
				x++;
				y--;
		} 
			if (Arrays.equals(niz, pomocna)) {
				System.out.println("Niz je palindrom");
			}
			else System.out.println("Niz nije palindrom");
		}
	}

