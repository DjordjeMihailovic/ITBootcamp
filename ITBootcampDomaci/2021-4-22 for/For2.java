package Domaci;

import java.util.Scanner;

public class For2 {
	


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = 15;
		int x = 0;
		int zbir = 0;
		
		while (x < n) {
		x++;
		if (x % 5 == 0) {
			continue;
		}
		if (x == 13) { 
			break;
		}
		zbir = zbir + x;		
		
		}
System.out.println(zbir);
}
}