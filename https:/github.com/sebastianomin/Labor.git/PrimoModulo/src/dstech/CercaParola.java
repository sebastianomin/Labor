package dstech;

import java.util.Scanner;
//data una frase ritorna la parola piu lunga
public class CercaParola {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		System.out.println("Inserisci la frase");
		String frase=scanner.nextLine();
		
	
		String massimo = parolaPiuLunga(frase);
		System.out.println("La parola più lunga è :" + massimo);
		
			}

	private static String  parolaPiuLunga(String frase) {
		String[] fraseSplittata=frase.split(" ");
		String massimo=fraseSplittata[0];
		for(int i=1;i<fraseSplittata.length;i++ ){
			if(massimo.length()<fraseSplittata[i].length()){
				massimo=fraseSplittata[i];
			}
			
		}
		return massimo;
		
	
	}

}