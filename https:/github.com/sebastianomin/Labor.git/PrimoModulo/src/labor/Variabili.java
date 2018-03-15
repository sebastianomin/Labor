package labor;

public class Variabili {
	public static void main(String[] args) {
		int numeroIntero=10;
		System.out.println(numeroIntero);
		numeroIntero=7;
		System.out.println(numeroIntero);
		double numeroConLaVirgola=6.7;
		System.out.println(numeroIntero+numeroConLaVirgola);
		
		int primo=10;
		int secondo=3;
	    double divisione=(double)primo/secondo;
	    double modulo=primo%secondo;
	    System.out.println(divisione);
	    System.out.println(modulo);
	    
	    int nuovoNumero=11;
	    
	    if(nuovoNumero%2==0){
	    	System.out.println("Allora è pari");
	    }else{
	    	System.out.println("Invece è dispari");
	    }
	    
	    int giornoDellaSettimana=0;
	    switch (giornoDellaSettimana) {
		case 1:
			System.out.println("Lunedì");
			break;
        case 2:
        	System.out.println("Martedì");
			break;
        case 3:
	        System.out.println("Mercoledì");
        	break;
        case 4:
	        System.out.println("Giovedì");
	        break;
	
        case 5:
	        System.out.println("Venerdì");
	       break;
        case 6:
	        System.out.println("Sabato");
	      break;
       case 7:
	       System.out.println("Domenica");
	      break;
	
       default:
	       System.out.println("Non hai scelto nessun giorno");
		  break;
		}
	}

}
