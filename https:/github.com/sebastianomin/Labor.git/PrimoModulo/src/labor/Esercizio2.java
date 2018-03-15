package labor;

import java.util.Scanner;

public class Esercizio2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		double primoNumero= scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Inserisci il secondo numero");
		double secondoNumero= scanner.nextDouble();
		scanner.nextLine();
		
		double somma=Operazioni.somma(primoNumero, secondoNumero);
		System.out.println("La somma dei due numeri è "+somma);
		double sottrazione =Operazioni.sottrazione(primoNumero, secondoNumero);
		System.out.println("La sottrazione dei due numeri è "+sottrazione);
		double divisione=Operazioni.divisione(primoNumero, secondoNumero);
		System.out.println("La divisione dei due numeri è" +divisione);
		double moltiplicazione=Operazioni.moltiplicazione(primoNumero, secondoNumero);
		System.out.println("La moltiplicazione dei due numeri è "+moltiplicazione);
		
		}
	
	

}
