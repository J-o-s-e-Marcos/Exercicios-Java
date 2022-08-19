package Teste;


import java.util.Arrays;
import java.util.Scanner;

public class teste1 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        String str1, str2;
        
        System.out.println("Digite a primeira palavra: ");
        str1 = entrada.nextLine();
        System.out.println("Digite a segunda palavra: ");
        str2 = entrada.nextLine();
      
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        if (Arrays.equals(a, b)) {
            System.out.println("Eh um Anagrama!");
        } else {
            System.out.println("Não eh anagrama!");
        }
	}
}
