package labor;



import java.util.Scanner;

public class GestioneArray {
	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		System.out.println("Dimmi la dimensione dell'Array");
		int dimensioneArray= scanner.nextInt();
		scanner.nextLine();
		int[]array= new int [dimensioneArray];
		for(int i=0;i<array.length;i++){
			System.out.println("Leggi l'elemento" + (i+1) + "dell'Array");
			array[i]=scanner.nextInt();
			scanner.nextLine();
		}
		stampaArray(array);
		int minimoArray=minimo(array);
		System.out.println("Il minimo è" + minimoArray);
		int massimoArray=massimo(array);
		System.out.println("Il massimo è" + massimoArray);
		if(minimoArray==massimoArray){
			System.out.println("Massimo e minimo sono uguali");
		}
			else{
				System.out.println("L'array non ha gli elementi uguali  ");
	
		}
		stampaIndiciPari(array);
		stampaPariDispari(array);
	}
private static void stampaPariDispari(int[] array) {
		for(int i=0;i<array.length;i++){
			if(i%2==0 && array[i]%2==1){
				System.out.println( "posizione pari " +i+ " elemento dispari"+  array[i]);
			}
				else{
					if(i%2==1 && array[i]%2==0)
						System.out.println( "pos dispari" +i+  " elemento pari"+ array[i]);
				
			}
			
		}
		
	}
private static void stampaIndiciPari(int[] array) {
		for (int i=0;i<array.length;i++){
			if(i%2==0){
				System.out.println(array[i]);
			}
		}
		
	}
private static int minimo(int[] array) {
		int minimo=array[0];
		for(int i=1; i<array.length;i++){
			if(array[i]<minimo){
				minimo=array[i];
			}
			}
		return minimo;
		}
	
private static int massimo(int[] array) {
		int massimo=array[0];
		for(int i=1; i<array.length;i++){
			if(array[i]>massimo){
				massimo=array[i];
			}
		}
		return massimo;
	}
public static void stampaArray(int[]vettore){
	for(int i=0;i<vettore.length;i++){
		System.out.println(vettore[i]+ " ");
	
}
	System.out.println();
}
}