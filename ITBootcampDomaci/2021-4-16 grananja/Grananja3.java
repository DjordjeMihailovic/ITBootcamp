package Grananja;

import java.util.Scanner;

public class Grananja3 {

	public static void main(String[] args) {
		System.out.println("Upisite zeljeni mesec: ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
	switch (c) {
	case 'J':
		System.out.println("Broj meseci koji pocinju na ovo slovo je: 3");
		break;
	case 'F':
		System.out.println("Broj meseci koji pocinju na ovo slovo je: 1");
		break;
	case 'M':
		System.out.println("Broj meseci koji pocinju na ovo slovo je: 2");
		break;
	case 'A':
		System.out.println("Broj meseci koji pocinju na ovo slovo je: 2");
		break;
	case 'S':
		System.out.println("Broj meseci koji pocinju na ovo slovo je: 1");
		break;
	case 'O':
		System.out.println("Broj meseci koji pocinju na ovo slovo je: 1");
		break;
	case 'N':
		System.out.println("Broj meseci koji pocinju na ovo slovo je: 1");
		break;
	case 'D':
		System.out.println("Broj meseci koji pocinju na ovo slovo je: 1");
		break;
	default:
		System.out.println("Molimo unesite validan mesec u validnom formatu (veliko slovo)");
	}
}
}