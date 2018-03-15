package esercizi;

import java.util.Scanner;

public class GestioneArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dimmi la dimensione dell'array:");
		int dimensioneArray = scanner.nextInt();
		scanner.nextLine();
		int[] array = new int[dimensioneArray];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Inserisci l'elemento " + (i + 1) + " dell'array: ");
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}
		stampaArray(array);
		int minimoArray = minimo(array);
		System.out.println("Il minimo è " + minimoArray);
		stampaIndiciPari(array);

	}

	private static void stampaIndiciPari(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}

	private static int minimo(int[] array) {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}

	public static void stampaArray(int[] vettore) {
		for (int i = 0; i < vettore.length; i++) {
			System.out.print(vettore[i] + " ");
		}
		System.out.println();
	}
}