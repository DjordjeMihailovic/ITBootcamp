package Domaci;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int niz[] = new int[3];
		System.out.println("Upisite 3 elementa niza");
		int x = 0;
		while (x < niz.length) {
			niz[x] = sc.nextInt();
			x++;
		}
		System.out.println(Proizvod(niz));

	}
	public static int Proizvod(int[] niz1) {
		int x = 0;
		int proizvod = 1;
		while (x < niz1.length) {
			proizvod = proizvod * niz1[x];
			x++;
		}
		return proizvod;
	}
}
