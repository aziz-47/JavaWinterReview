package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		// Double bir degsiken olsuturop ve bunu int sonrada Byte cevirir imisniz?
		
		double numDouble = 15;
		
		int numInt= (int) numDouble;
		//Double dan int gecerken eger onaldikli  bir sayi varsa Java ondaklik kmismi atar yok sayar
		System.out.println("Integer degsiken degeri: "+numInt);
		
		byte numByte= (byte)numInt;
		System.out.println("Byte degsiken deger: " + numByte);

	}

}
