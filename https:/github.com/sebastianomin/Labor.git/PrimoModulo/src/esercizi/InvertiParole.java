package esercizi;

import java.util.Scanner;

public class InvertiParole {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dammi la frase da invertire");
		String frase = scanner.nextLine();
		System.out.println("La frase da invertire è: " + frase);
		String[] parole = frase.split(" ");
		for (int i = 0; i < parole.length; i++) {
			parole[i] = inverti(parole[i]);
		}
		for (int i = 0; i < parole.length; i++) {
			System.out.print(parole[i] + " ");
		}
	}

	private static String inverti(String string) {
		String risultato = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			risultato += string.charAt(i);
		}
		return risultato;
	}
}