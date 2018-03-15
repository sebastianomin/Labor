package labor;

import java.util.Scanner;

public class InteriStringheMetodo2 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		System.out.println("Dammi la dimensione dell' array di numeri");
		int dimensioneArrayNumeri= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Dammi la dimensione dell' array di stringhe");
		int dimensioneArrayStringhe= scanner.nextInt();
		scanner.nextLine();
		int[] arrayNumeri=new int [dimensioneArrayStringhe];
		String[]arrayStringhe=new String[dimensioneArrayStringhe];
		for(int i=0;i<arrayNumeri.length;i++){
			System.out.println("Inserisci il numero" +i);
			arrayNumeri[i]=scanner.nextInt();
			scanner.nextLine();
		}
		for(int i=0;i<arrayStringhe.length;i++){
			System.out.println("Inserisci il numero" +i);
			arrayStringhe[i]=scanner.nextLine();
		}
		
	}

}
