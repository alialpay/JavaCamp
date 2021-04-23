package arraysDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String ogrenci1="Ali";
		String ogrenci2="Batuhan";
		String ogrenci3="Tolga";
		String ogrenci4="Furkan";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-----------");
		
		String[] ogrenciler = {"Ali","Batuhan","Tolga","Furkan"};
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		System.out.println("-----------");
		
		
	}

}
