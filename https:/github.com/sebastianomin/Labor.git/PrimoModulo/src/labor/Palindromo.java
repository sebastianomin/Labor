package labor;

import java.util.Scanner;
/// Ricevo una stringa e restituisco vero o falso se la stinga è palindroma
//Es. Bob , i topi non avevano nipoti

public class Palindromo {
	public static void main(String[] args) {

		Scanner scanner =new Scanner (System.in);
		System.out.println("Inserisci il testo per verificare se palindromo");
		String testo=scanner.nextLine();
		boolean verifica=verificaPalindromo(testo);
			System.out.println(verifica);
		}
	
	

		
	private static boolean verificaPalindromo(String testo) {
		String frasePulita=testo.replace(" ", "");
		for(int i=0;i<frasePulita.length()/2;i++){
			if(frasePulita.charAt(i)!=frasePulita.charAt(frasePulita.length()-1-i)){
		return false;
	}

		}
		return true;
	}

		
	}

