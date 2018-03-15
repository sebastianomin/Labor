package esercizi;

import java.util.Scanner;

public class GestioneStringhe {
	public static void main(String[] args) {
		String nomeStringa = "Ciao a tutti voi";
		boolean risultato = nomeStringa.equals("salve");
		System.out.println(risultato);
		String substring = nomeStringa.substring(1, 3);
		System.out.println(substring);
		char charAt = nomeStringa.charAt(0);
		System.out.println(charAt);
		System.out.println(nomeStringa.length());
		for(int i = 0; i < nomeStringa.length() ; i++){
			System.out.println(nomeStringa.charAt(i));
		}
		System.out.println(nomeStringa.toUpperCase());
		System.out.println(nomeStringa.toLowerCase());
		int indexOf = nomeStringa.indexOf('i');
		System.out.println(indexOf);
		boolean endsWith = nomeStringa.endsWith("tti");
		System.out.println(endsWith);
		System.out.println(nomeStringa + " altra stringa");
		String [] vettoreDiStringhe = new String [3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < vettoreDiStringhe.length; i++) {
			vettoreDiStringhe[i] = scanner.nextLine();
		}
		for (int i = 0; i < vettoreDiStringhe.length; i++) {
			System.out.println(vettoreDiStringhe[i]);
		}
		
	}
}