package DEMO3_5_CaseStudy;

public class CaseStudy01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//取得する情報
		int maxTemp = 30;
		int minTemp = 10;
		int currentTemp = 25;
		
		if(currentTemp > maxTemp) {
			System.out.println("温度が高すぎます。");
		}else if (currentTemp < minTemp) {
			System.out.println("温度が低すぎます。");
		}else {
			System.out.println("現在の温度は安全範囲です。");
		}
		
		if(currentTemp % 2 == 0) {
			System.out.println("温度が偶数；最適");
		}else {
			System.out.println("温度が奇数：化学反応が起こります。");
		}
	}

}
