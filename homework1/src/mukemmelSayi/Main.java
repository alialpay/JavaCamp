package mukemmelSayi;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//28 --> 1,2,4,7,14
		
		int number =29;
		int toplam = 0;
		for(int i =1; i<number;i++) {
			if (number % i == 0) {
				toplam+=i;
			}
		}
		
		if (toplam==number) {
			System.out.println("Mükemmel sayýdýr");
		} else {
			System.out.println("Mükemmel sayý deðildir");
		}
		
		
		/*
		int number = 28;
		ArrayList carpanlarArrayList = new ArrayList();
		
		for(int i=1; i < number; i++) {
			if (number % i == 0) {
				carpanlarArrayList.add(i);
				
			}
		}
		System.out.println("Sayýnýn çarpanlarý :" + carpanlarArrayList);
		int toplam = 0;
		
		for(int i=0; i<=carpanlarArrayList.size(); i++) {
			
			toplam+=i;
			if (toplam==number) {
				System.out.println("Mükemmel sayýdýr");
			}
		}*/
	}

}
