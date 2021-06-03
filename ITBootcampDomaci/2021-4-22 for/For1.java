package Domaci;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		String s2 = "STOP";
		
		while (x != 1) {
			System.out.println("Upisite rec: ");
			String s1 =  sc.nextLine();
			s1 = s1.toUpperCase();
			if (s1.equals(s2)) {
				x = 1;
			}
			
		}
		System.out.println("STOP!");
	}

}
