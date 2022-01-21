package day03;

import java.util.Scanner;

public class C1_Scanner1 {
	public static void main(String[] args) {
		
		
		//kullanicidan iism ve soysisim alinip 
		//kurusunuza kayit yapilmisy=tir
		//Scanner kullanicdan bilgi almak ici kullanilior.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isimnijzi giriniz");
		
		String name= scan.nextLine();
		
		System.out.println("Lutfen soyismnizi girniz");
		
		String surname= scan.nextLine();
		
		System.out.println("Isminiz: " + name + " Soyisminiz: " + surname+ " Kursumuza kaydiniz alinmistir.");
		
		
		
	}

}
