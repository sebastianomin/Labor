package labor;
//Leggere da tastiera un array di interi
//leggere da tastiera un array di string
//le dimensioni possono essere differenti e inserirle da tastiera
//dire se la somma di interi è> delle lunghezze contenute nell'array di stringhe

import java.util.Scanner;

public class InteriStringhe {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner (System.in);
		System.out.println("Dimensione Array");
		int dimensioneArray= scanner.nextInt();
		scanner.nextLine();
		
		int[]array= new int [dimensioneArray];
		for(int i=0;i<array.length;i++){
			System.out.println("Elemento" + i + "dell'Array");
			array[i]=scanner.nextInt();
			scanner.nextLine();
		}
		Scanner scanner1 =new Scanner (System.in);
		System.out.println("Dimensione Array di Stringhe");
		int dimensioneArray2= scanner1.nextInt();
		scanner1.nextLine();
		
		String [] stringhe =new String[dimensioneArray2];
		Scanner scanner2 =new Scanner (System.in);
		
		for (int i=0; i<stringhe.length;i++){
			System.out.println("Elemento" + i + "dell'Array");
			stringhe[i]=scanner1.nextLine();
		
		}
		int sommaInteri=0;
		for(int i=0;i<array.length;i++){
			sommaInteri+=array[i];
			}
			System.out.println(sommaInteri);
			
		int sommaStringhe=0;	
		for (int i=0;i<stringhe.length;i++){
			sommaStringhe+=stringhe[i].length();
				
			}
			System.out.println(sommaStringhe);
			
		if(sommaInteri>sommaStringhe){
			System.out.println("L'array di numeri è più grosso dell'array di Stringhe");
		}else
			
		
				System.out.println("La somma non è maggiore");
			
		
		
		
	}
		}
		
		

	
	
	


