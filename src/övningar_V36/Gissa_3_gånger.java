package övningar_V36;

import java.util.Random;
import java.util.Scanner;



public class Gissa_3_gånger {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
		Scanner input = new Scanner ( System.in);
		
		System.out.println("enter your number "+i);
		int x = input.nextInt();
				
		Random rnd = new Random();
	
		int y = rnd.nextInt(100)+1 ;
		
		System.out.println(y);
		
		if ( x == y ) {
			System.out.println("bra jobbat");
			break;
		}
		else if ( x != y ) {
			
		System.out.println("försök igen");	
		
		
			
		}else {
			break ;
		}
		}
	
	System.out.println("bye bye ");

	
	}

}
