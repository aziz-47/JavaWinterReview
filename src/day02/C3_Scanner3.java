package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		//Kullnicdan ismini ve soysinmi alip aralarin bir bosluk birakarak isim ve soysisim yaziniz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isiminizi  giriniz");
		
		
		 String isim= scan.next();
		 
		 System.out.println("Lutfen soyisminizi giriniz");
		 String soyisim= scan.next();
		 
		 System.out.println("Tam ismim :"+  isim+ " " + soyisim);
		

	}

}
