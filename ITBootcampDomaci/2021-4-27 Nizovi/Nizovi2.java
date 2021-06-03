package Domaci;

import java.util.Scanner;

public class Nizovi2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite velicinu niza");
		int z = sc.nextInt();
		int niz[] = new int[z];
		int UcitanNiz[] = UcitavanjeNiza(niz);
		System.out.println(Proizvod(UcitanNiz));
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
		
		public static int Proizvod(int[] niz1) {
			int x = 0;
			int proizvod = 1;
			while (x < niz1.length) {
				if (niz1[x] > x) {
				proizvod = proizvod * niz1[x];
			}
				x++;
			}
			return proizvod;
		}
	}



