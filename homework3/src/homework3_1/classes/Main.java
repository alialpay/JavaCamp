package homework3_1.classes;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		// value type
		int sayi1=10;
		int sayi2 =20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);

		// reference type
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {9,5,7};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		
	}

}
