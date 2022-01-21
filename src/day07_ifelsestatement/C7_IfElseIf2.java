package day07_ifelsestatement;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki tam sayi giriiz");
		
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		if(sayi1==0 || sayi2==0) {
			System.out.println("Sifir carpmya gore yutan elemdnir");
			
		}else if(sayi1>0 && sayi2>0) {
			System.out.println(sayi1+sayi2);
		}else if(sayi1<0 && sayi2<0) {
			System.out.println(sayi1*sayi2);
		}else  {
			System.out.println("Farkli sayilarda islem yapamazsin");
		}
			
		
		

	}

}
