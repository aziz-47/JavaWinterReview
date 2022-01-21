package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		//byte veri turunde bir degisken osuturp deger atayin sonra olusturluna veriablenin adima dim auto widening 
		//ile gensiletip yazniz
		
		byte numByte= 34;
		System.out.println("byte degsiken degeri: "+ numByte);
		
		//short yapalim
		
		short numShort= numByte;//short buy==yte an byuk oldugu icin Java sikayet etmiyor //Auto widenin ile degeri shor verialeatiyor
		
		System.out.println("Short degsiken deger:" + numShort);
		
		//Auto widenin sadece ve sadce primitive ve sayilar arasinda oluyor .
		
		
		int numInt= numShort;
		
		System.out.println("Integer degsiken degeri: "+ numInt);
		
		float numFloat= numInt;
		
		System.out.println("Float degsiken degeri: "+ numFloat);
		
		double numDouble= numFloat;
		
		System.out.println("Double degsiken degeri: " + numDouble);
		
		

	}

}
