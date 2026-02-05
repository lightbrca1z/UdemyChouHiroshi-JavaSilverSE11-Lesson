package DEMO2_1;

import java.util.concurrent.ThreadLocalRandom;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//変数の定義
		int a = 3;
		int b = 3;
		
		//計算ロジック
		int c = a / b;
		
		//出力
//		System.out.println("A = "+ a + " / " + "B = " + b + " = " + c);
		
		//0除算のエラーがある
		
		//コストの計算
		int personnelCosts = 250000;
		int utilityCosts = 50000;
		
		int operatingCosts =personnelCosts + utilityCosts;
		
		//月間の営業利益
		int sales = 1000000;
		
//		System.out.println(sales = operatingCosts);
		
		//販売 * 演算
		int salesPlan = 30000;
		int businessDays = 28;
		
		//System.out.printlnで、直接計算する。
		System.out.println(salesPlan * businessDays);
		
		System.out.println(salesPlan * businessDays + "注意点" + "2500000"+ "50000");
		System.out.println(salesPlan * businessDays + "注意点" + salesPlan + businessDays);
		
		System.out.println(30000 + 28 + "注意点" + salesPlan + businessDays);
		
		//文字列の結合は演算ではなく、結合として扱われる。整数の演算は演算として扱われる。
		
		//出勤人数は奇数　偶数
		int attendees = ThreadLocalRandom.current().nextInt(90, 101);
		int result = attendees % 2;
//		System.out.println(result);
//		
//		System.out.println(result % 2 ==  0 ? "偶数" : "奇数");
		
	}

}
