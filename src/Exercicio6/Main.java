package Exercicio6;

import java.util.Locale;
import java.util.Scanner;

import Exercicio5.Employee;

public class Main {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Write the name: ");
		student.name = sc.nextLine();
		System.out.println("Write the grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Write the grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Write the grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Final grade:  %.2f%n", student.finalGrade());

		if(student.finalGrade() < 60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points%n", student.missingPoints());
			
		} else {
			System.out.println("Pass");
		}
		sc.close();
		
		
		

	}

}
