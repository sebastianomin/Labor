package dstech;

import java.util.Scanner;

public class InvertiParole {
	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		System.out.println("Inserisci una frase");
		String testo=scanner.nextLine();
		System.out.println("La frase da invertire è: " + testo);
		
		String[] testoSplittato=testo.split(" ");
		Scanner scanner1 =new Scanner (System.in);
		for(int i=0;i<testoSplittato.length; i++){
			for(int j=testoSplittato[i].length()-1;j>=0;j--){
				
				System.out.print(testoSplittato[i].charAt(j));
			}
			System.out.print (" ");
		}
		
		
	
	}
}
