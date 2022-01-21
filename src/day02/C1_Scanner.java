package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		//Scanner ile kullanicidan bilgi alabiulriz.
		//3 adimla scanner ile  islemini gerceklestiriyoruz
		
		//1.adim Scanneer olusturcagiz
		
		Scanner scan = new Scanner(System.in);
		
		//new:Java da ne zman new kelimesi gorursek yeni ir object olusturluyor demektir.
		//parentezin icine yazilan degerlere parametre diyoruz ve Scanner icin System.in yazmamiz gerekir
		//scan olusturdgumuz Scanner objesine verdigimiz isimdir.
		
		//2.adim kullaniciya bir mesaj yazin
		
		System.out.println("Karenin bir kenar uzunlugunu yaziniz");
		
		//3.adim kullanicinin konsaloa giridigi degeri programimiza alacagiz
		//ve bir veriable olsuturacagiz
		//Kulnicidan bir kenar uzunlugu istedgim icin kullanici bir kucuk sayi da veya buyuk bir sayi da verebilri.
		double kenar= scan.nextDouble();
		
		System.out.println("Karenin Alani: "+kenar*kenar);
		
		
		
		

	}

}
