package labor;

public class giorniMese {
	public static void main(String[] args) {
		
	
	int mese=1;
	
	if(mese==1||mese==3||mese==5||mese==7||mese==8||mese==10||mese==12){
		System.out.println("il mese è di 31");
	}
		else if(mese==2){
				System.out.println("il mese è di 28");
		}
			else{
				
				if(mese==4||mese==6||mese==9||mese==11)
				System.out.println("il mese è di 30");
	}
	
		
	}
	
}
