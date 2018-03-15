package labor;

import java.util.Scanner;

public class VerificaTestoIntero {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String testo=scanner.nextLine();
		boolean flag=true;
		System.out.println("il testo inserito è "+testo);
		while(flag){
		try{
			flag=false;
		    int parseInt=Integer.parseInt(testo);
		}catch(NumberFormatException exp){
			System.out.println("Il testo inserito è: "+testo);
			System.out.println("Hai inserito un testo e non un numero");
			System.out.println("Inserisci un nuovo nuemero");
			testo=scanner.nextLine();
			flag=true;
		}
			
		}
		System.out.println(testo);
	}

}
