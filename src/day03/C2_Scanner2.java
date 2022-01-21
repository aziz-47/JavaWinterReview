package day03;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		//Kullinicdan ismini isteyip ilk harfini buyuk harf olarak yazin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		char isim= scan.next().toUpperCase().charAt(0);
		
		//eger charAt() yazdiktan sonra . koyrasak metodlar gelmez cunku charAt() kullninca veriablemizi char  yapmis oluruu
		//char primitive dta tipidir ve metodlari yoktur
		//primitive data tipleri metodlara sahip degildir.
		
		
		System.out.println(isim);
		
		
		

	}

}
