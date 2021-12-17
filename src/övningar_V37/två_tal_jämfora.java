package övningar_V37;

import java.util.Scanner;

public class två_tal_jämfora {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		jämför(input);
		teeth();
		System.out.println("enter your kilo");
	System.out.println(kilogram_Pound(input));	
	}
	public static void jämför ( Scanner input) {
		System.out.println("enter your first number ");
		int x = input.nextInt();
		System.out.println("enter your second number ");
		int y = input.nextInt();
		
		if ( x > y )
			System.out.println("its bigger ");
		
		else if ( x < y)
			System.out.println("its smaller");
		else 
			System.out.println("same");
	}
	public static void teeth () {
		
		int no_f_teeth_cleand ;
		for ( no_f_teeth_cleand  = 1; no_f_teeth_cleand < 33; no_f_teeth_cleand++) {
			System.out.println(no_f_teeth_cleand);
		}
	}
	public static double kilogram_Pound (Scanner input) {
		
		double x = input.nextDouble();
		double p = x / 2.24 ;
		return p;
		
		
	}
	}
