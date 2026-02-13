package DEMO3_4;

public class IfStatement4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//変数の宣言 ab
		int a = 0;
		int b = 3;
		//変数への代入
		int c = a + b;
//		//if判断
//		if(c > 10) {
//			//結果がtrue ロジック
//			System.out.println("OK");
//		}
		//trueの判断
		
		//if判断
		if(c > 15) {
			//結果がtrue ロジック
			System.out.println("OK");
		}else if(c > 10) {
			System.out.println("OK2");
		}else if(c > 5) {
			System.out.println("OK3");
		}else {
			System.out.println("final OK");
		}
		
	}

}
