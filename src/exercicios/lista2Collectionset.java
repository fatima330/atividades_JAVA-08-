package exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class lista2Collectionset {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashSet<Integer> setNumeros = new HashSet<Integer>();
				
		
		
		for (int i = 0; i <10; i++) {			
			System.out.println("digite um numero inteiro por vez que não seja repetido: ");
			setNumeros.add(scanner.nextInt());	
					
			
		}
		System.out.println("Listar dados do Set:\n");
		
		Iterator<Integer> iSetNumeros= setNumeros.iterator();
		
		while(iSetNumeros.hasNext()) {
			System.out.println(iSetNumeros.next());
		}
		
		 
	}	
}
