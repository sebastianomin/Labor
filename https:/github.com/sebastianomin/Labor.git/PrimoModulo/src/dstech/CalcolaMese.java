package dstech;

import java.util.Scanner;

//input un numero 
//return il numero dei giorni del mese associato al numero

public class CalcolaMese {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Inserisci il numero relativo al mese");
		int mese = scanner.nextInt();
		scanner.nextLine();
		switch (mese) {
		case 1:
			System.out.println("Il mese è di 31");
			break;
		case 2:
			System.out.println("Il mese è di 28");
			break;
		case 3:
			System.out.println("Il mese è di 31");
			break;
		case 4:
			System.out.println("Il mese è di 30");
			break;
		case 5:
			System.out.println("Il mese è di 31");
			break;
		case 6:
			System.out.println("Il mese è di 30");
			break;
		case 7:
			System.out.println("Il mese è di 31");
			break;
		case 8:
			System.out.println("Il mese è di 31");
			break;
		case 9:
			System.out.println("Il mese è di 30");
			break;
		case 10:
			System.out.println("Il mese è di 31");
			break;
		case 11:
			System.out.println("Il mese è di 30");
			break;
		case 12:
			System.out.println("Il mese è di 31");
			break;
		default:
			System.out.println("Non è un mese");
			break;
		}
	}

}
