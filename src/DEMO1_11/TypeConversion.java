package DEMO1_11;

public class TypeConversion {
	
	public static void main(String[] args) {
//		byte a = '8';
//		
//		short b = a;
//		System.out.println(b);
//		
//		int c = a;
//		System.out.println(c);
//		
//		float d = a;
//		System.out.println(d);
//		
//		long e = a;
//		System.out.println(e);
//		
//		double f = a;
//		System.out.println(f);
		
		//交換前
		int a = 15, b = 16;
		System.out.println("交換前:a=" + a + ", b= " + b);
		
		//交換処理
		int t = a;
		a = b;
		b = t;
		System.out.println("交換後:a=" + a + ", b= " + b);
	}
}
