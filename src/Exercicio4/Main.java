package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter Rectangle Width and Height");
		rect.Width = sc.nextDouble();
		rect.Height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n ", rect.Area());
		System.out.printf("Perimeter = %.2f%n ", rect.Perimeter());
		System.out.printf("Diagonal = %.2f%n ", rect.Diagonal());
		sc.close();
	}

}
