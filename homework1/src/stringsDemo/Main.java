package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.   ";
		
		System.out.println(mesaj);
		
//		System.out.println("Karakter Sayýsý : " + mesaj.length());
//		System.out.println("5. Karakter : " + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yaþasýn!"));
//		System.out.println(mesaj);
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.startsWith("a"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("a"));
//		System.out.println(mesaj.lastIndexOf("a"));
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,7));
		
		for(String kelimeString : mesaj.split(" ")) {
			System.out.println(kelimeString);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
	}

}
