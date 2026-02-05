package DEMO2_2;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//ECサイトの品質とコスト
//		int a = 12312;
		//論理演算子
		boolean a = true;
		boolean b = false;
		boolean c = a && b;
		System.out.println(c);
		c = a || b;
		System.out.println(c);
		//booleanを使う。論理式をintに代入したら、エラーになる。
		a = !a;
		System.out.println(a);
	}

}
