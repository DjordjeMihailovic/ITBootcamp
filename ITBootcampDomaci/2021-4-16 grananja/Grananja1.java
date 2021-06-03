package Grananja;

import java.util.Scanner;

public class Grananja1 {

	  public static void main(String[] args) 
	    {	       
	        Scanner s = new Scanner(System.in);
	        System.out.println("Upisite zeljeni broj:");
	        int n;
	        n = s.nextInt();
	        if(n % 2 == 0)
	        {
	            System.out.println("broj je paran");
	        }
	        else
	        {
	            System.out.println("broj je neparan ");
		}
	    }
	}