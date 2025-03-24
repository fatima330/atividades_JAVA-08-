package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class lista1collectionArraylist {

	public static void main(String[] args) {


		Scanner Scanner = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("digite uma cor: ");
			cores.add(Scanner.next());
			
		}
		
		
		System.out.println("\n---- Listar todas as cores: ----");
		
		for (String cor : cores) {
			System.out.println(cor);
			
			
		}
		 
		
		
		System.out.println("\n----- Cores ordenadas: -----" );
		
		cores.sort(null);
		
		for (String cor : cores) {
			System.out.println(cor);			
			
		}
		
		
		
		
		
	} 

}
