package first;

import java.util.Scanner;

public class Sintaksa1 {

	public static void main(String[] args) {
		System.out.println("Upisite duzinu prostorije: ");
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		System.out.println("Upisite sirinu prostorije: ");
		int y;
		y = sc.nextInt();
		System.out.println("Upisite visinu prostorije: ");
		int z;
		z = sc.nextInt();
		int pod = x*y;
		int povrs = x*y*z;
	System.out.println("Povrsina okrecene prostorije je: " + (povrs-pod)); 
}
}