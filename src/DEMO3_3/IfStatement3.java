package DEMO3_3;

public class IfStatement3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 11;
		// 20　大きいなのか、小さいなのか。
		//20より小さいなら、偶数か、奇数なのか。
//		if(num < 20) {
//			if(num % 2 == 0) {
//				System.out.println("偶数");
//			}else {
//				System.out.println("奇数");
//			}
//		}
		if(num == 10) {
			if(num % 2 == 0) {
				System.out.println("偶数");
			}else {
				System.out.println("奇数");
			}
		}else {
			System.out.println("10ではない。");
		}
	}

}
