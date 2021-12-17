package övningar_V37;

import java.util.Scanner;

public class Area_Omkrets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//	Rectangle(input);
	//	Fyrkant(input);
		Cirkel(input);
	}

	public static void Rectangle(Scanner input) {
		System.out.println("enter the axes for Rectangle");
		int x = input.nextInt();
		int y = input.nextInt();
		int area = x * y;
		int omkrets = (x + y) * 2;
		System.out.printf("Area %d omkrets %d for Rektangle", area, omkrets);

	}

	public static void Fyrkant(Scanner input) {
		System.out.println("enter the axes for fyrkant");
		int x = input.nextInt();
		int y = input.nextInt();
		int area = x * y;
		int omkrets = x * 4;
		System.out.printf("Area %d omkrets %d for Fyrkant", area, omkrets);

	}

	public static void Cirkel(Scanner input) {
		System.out.println("enter the Radius");
		double x = input.nextDouble();

		double area = (Math.pow(x, 2)) * (3.14);
		double omkrets = (x + x) * 3.14;
		System.out.println("Area for Cirkel  "+ area);
		System.out.println("omkrets for Cirkel  "+ omkrets);

	}

}
