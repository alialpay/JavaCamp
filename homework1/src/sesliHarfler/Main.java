package sesliHarfler;

public class Main {
	public static void main(String[] args) {
		char harf ='E';
		
		switch (harf){
		case 'A' :
		case 'O' :
		case 'U' :
		case 'I' :
			System.out.println("Kalýn sesli harf");
			break;
		default:
			System.out.println("Ýnce sesli harf");		
			}
	}
}
