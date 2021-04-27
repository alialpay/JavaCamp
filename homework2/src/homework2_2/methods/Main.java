package homework2_2.methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };

		boolean varMi = false;
		int aranacak = 3;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj ="";
		if (varMi == true) {
			mesaj = "Sayý mevcuttur: "+aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayý mevcut deðildir: "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
