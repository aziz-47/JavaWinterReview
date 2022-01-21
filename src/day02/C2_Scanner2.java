package day02;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
	//Kullnicdan dairenin yari capi istyin ve dairenin alanini yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dairenin yari capini giriniz");
		
		double yaricap= scan.nextDouble();
		
		System.out.println("Dairenin alani: "+yaricap*yaricap*3.14);

	}

}
