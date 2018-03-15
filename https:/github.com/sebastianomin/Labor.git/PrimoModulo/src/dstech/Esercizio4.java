package dstech;

import java.util.Scanner;

public class Esercizio4 {
	public static void main(String[] args) {
		int [] array=new int [5];
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i< array.length ;i++ ){
			System.out.println("Inserisci il prossimo elemento nell'Array");
			array[i]=scanner.nextInt();
			scanner.nextLine();
		}
			
		System.out.println("Ho finito di leggere i numeri");
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+ " ");
			
		}
	}

}