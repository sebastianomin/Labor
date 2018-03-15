package esercizi;

import java.util.Scanner;

public class MassimoMinimoParole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase = scanner.nextLine();
		
		String massimo = parolaPiuLunga(frase);
		System.out.println("La parola più lunga è: " + massimo);
	}

	private static String parolaPiuLunga(String frase) {
		String[] fraseSplittata = frase.split(" ");
		String massimo = fraseSplittata[0];
		for (int i = 1; i < fraseSplittata.length; i++) {
			if(massimo.length() < fraseSplittata[i].length()){
				massimo = fraseSplittata[i];
			}
		}
		return massimo;
	}

}
