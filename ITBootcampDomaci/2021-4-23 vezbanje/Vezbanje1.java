package Domaci;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		double cena = 0;
		double racun = 0;
		int y = 0;
		double naplata = 0;
				
		while ( y == 0 ) {
		System.out.println("Izaberite validnu opciju:");
		System.out.println("0 - Izlaz iz programa");
		System.out.println("1 - Dodavanje cene proizvoda:");
		System.out.println("2 - naplata racuna:");	
		int x = sc.nextInt();
		
		if (x == 0 && racun == 0) {			
			break;
		}
		if (x == 0 && racun != 0) {
			System.out.println("Vas racun iznosi: " + racun + ". molimo izmirite dugovanje");	
		}			
		if (x == 1)	{
			System.out.println("Upisite cenu proizvoda: ");
			cena = sc.nextDouble();
			racun = racun + cena;
			System.out.println("Vas racun je: " + racun + ".");		
		}
		if (x == 2 && racun != 0) {			
			System.out.println("Vas racun je: " + racun + ". Unesite sumu za naplatu");
			naplata = sc.nextDouble();
			if (naplata < racun) {
				System.out.println("Greska - nedovoljno sredstava");
			}
			else {
				System.out.println("Vas kusur je: " + (naplata - racun));
				racun = 0;
			}
				
			}
		if (x == 2 && racun == 0) {
			System.out.println("Vas racun je 0.");
		}
		}			
		System.out.println("Hvala na kupovini!");	
}
}
