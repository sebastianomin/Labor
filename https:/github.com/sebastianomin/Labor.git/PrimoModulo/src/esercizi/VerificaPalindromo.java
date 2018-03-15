package esercizi;

import java.util.Scanner;

public class VerificaPalindromo {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Inserisci il testo per Verificare se Palindromo");
		String testo =scanner.nextLine();
		boolean verifica =verificaPalindromo(testo);
		System.out.println(verifica);
		
		}

	private static boolean verificaPalindromo(String testo) {
		String fraseSenzaSpazi=testo.replace(" ", "");
		for (int i = 0; i < fraseSenzaSpazi.length()/2; i++) {
		   if(fraseSenzaSpazi.charAt(i)!=fraseSenzaSpazi.charAt(fraseSenzaSpazi.length()-1-i)) {
			   return false;
		   }
			   
			
		}
		
		return true;
	}
	

}
