package labor;

import java.util.Scanner;

public class EsercizioPariDispari {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci la dimensione dell'Array");
		int dimensione= scanner.nextInt();
		scanner.nextLine();
	    
		int[] array=new int [dimensione];
		for(int i=0; i< dimensione ;i++ ){
			System.out.println("Inserisci l'elemento dell'array in posizione " +i);
			array[i]=scanner.nextInt();
			scanner.nextLine();
			
		
	}
		int pari=0;
		int dispari=0;
		for(int i=0; i< array.length ;i++ ){
			if(array[i]%2==0)
				pari++;
			else
				dispari++;
		}
		
		System.out.println("Gli elementi pari sono "+ pari + "\nGli elementi dispari sono "+ dispari);
	}

}