package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade ='C';
		
		switch (grade) { 
		case 'A': 
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		
		case 'B': 
		case 'C': 
			System.out.println("�yi : Ge�tiniz");
			break;
		
		case 'D': 
			System.out.println("Fena De�i� : Ge�tiniz");
			break;
		
		case 'F': 
			System.out.println("Maalesef : Kald�n�z");
			break;
		
		default:
			System.out.println("Ge�ersiz not girdiniz");		
		}
	}

}
