package övningar_V37;

import java.util.Scanner;

public class backlänge_siffror {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int y = 7654838;
		String x = String.valueOf(y);
		String z ="";
		
		for (int i = x.length()-1; i >= 0; i--) {
			z+=x.charAt(i);
		}
		
		System.out.println(z);
		
	}

}
