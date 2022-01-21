package day06_ifstatements;

public class C1_IfStatement1 {

	public static void main(String[] args) {
		
		
		int a= 10;
		int b= 8;
		
		if(a>b) {
			System.out.println("Ilk sayi buyuktur.");
		}
		
		if(a<b) {
			System.out.println("Sayilarin carpimi negatifitr.");
		}
		
		if(a<b || b>0) {
			System.out.println("OR'lu cumlesi calisir.");
		}
		
		if(a-b>0 && a*b>0) {
			System.out.println("AND cumlesi calisir.");
			
		}

	}

}
