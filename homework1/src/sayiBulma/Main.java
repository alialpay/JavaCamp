package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = {1,2,5,7,9,0};
		
		boolean varMi = false;
		int aranacak = 3;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
			}
		}
		if (varMi==true) {
			System.out.println("Sayý mevcuttur");
		}else {
			System.out.println("Sayý bulunamadý");
		}
	}

}
