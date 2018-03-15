package labor;

//Scrivere un algoritmo che faccia la somma degli interi da 0 a 30 divisibili per 3: 
//utilizzando il while
//utilizzando il for
//utilizzando il doWhile
//e un main nel quale testarli.

public class Esercizio1 {
	
	public static void main(String[] args) {
		metodoWhile();
		metodoFor();
		metodoDoWhile();
	}

	
  private static void metodoWhile() {
	  int numero=0;
	  int somma=0;
	  while(numero<=30&&numero>=0) {
		  if(numero%3==0) {
			  somma+=numero;
			 }
		  numero++;
		  
	  }
	  System.out.println("Somma nel while "+somma);
	  }
  
	
	private static void metodoFor() {
		int somma=0;
		for (int i = 0; i <=30; i+=3) {
				somma+=i;
			}
			System.out.println("Somma nel for "+somma);
		}
		
		
	
	
	private static void metodoDoWhile() {
		int numero=0;
		int somma=0;
		do {
			if(numero%3==0) {
				somma+=numero;
			}
			numero++;
		}
		while(numero>=0&&numero<=30);
		System.out.println("Somma nel doWhile "+somma);
		
	}
	
	
	

}
