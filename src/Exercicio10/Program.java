package Exercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import Exercicio10.enums.Color;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		List<Shape>list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape # " + i + " data:" );
			System.out.print("rectangle or Circle (r/c");
			char ch = sc.next().charAt(0);
			System.out.print("Clor (Blue/Read/Black)");
			Color color =  Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double Height = sc.nextDouble();
				list.add(new Rectangle(color, width, Height));
				
			}
			else {
				System.out.print("Radius: ");
				double Radius = sc.nextDouble();
				list.add(new Circle(color, Radius));
				
			}
			
			System.out.println();
			System.out.println("Shape Areas");
			for(Shape shape : list) {
				System.out.println(String.format("%.sf", shape.area()));
			}
		}
		
	}

}
