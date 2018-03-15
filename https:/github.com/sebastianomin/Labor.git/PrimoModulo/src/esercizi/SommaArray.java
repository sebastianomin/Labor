package esercizi;

import java.util.Scanner;

public class SommaArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dammi la dimensione dell'array di numeri");
		int dimensioneArrayNumeri = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Dammi la dimensione dell'array di stringhe");
		int dimensioneArrayStringhe = scanner.nextInt();
		scanner.nextLine();
		int[] arrayNumeri = new int[dimensioneArrayNumeri];
		String[] arrayStringhe = new String[dimensioneArrayStringhe];
		for (int i = 0; i < arrayNumeri.length; i++) {
			System.out.println("Inserisci il numero " + i);
			arrayNumeri[i] = scanner.nextInt();
			scanner.nextLine();
		}
		for (int i = 0; i < arrayStringhe.length; i++) {
			System.out.println("Inserisci la stringa " + i);
			arrayStringhe[i] = scanner.nextLine();
		}
		int sommaInteri = 0;
		for (int i = 0; i < arrayNumeri.length; i++) {
			sommaInteri += arrayNumeri[i];
		}
		int sommaStringhe = 0;
		for (int i = 0; i < arrayStringhe.length; i++) {
			sommaStringhe += arrayStringhe[i].length();
		}
		if(sommaInteri > sommaStringhe){
			System.out.println("L'array di numeri è maggiore di quello di stringhe");
		} else {
			System.out.println("L'array di stringhe è maggiore di quello di numeri");
		}
	}
}
