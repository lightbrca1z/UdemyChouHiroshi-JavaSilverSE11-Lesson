package DEMO1_4;

public class Variable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//3.1
		int a = 5;
		String Text = "Hello";
		//3.2
		// int a = 5は不可。
		//一つの中のクラスに、一つの変数。
		//変数名 英語、数字入力可能。
		//$,_入力可能。
		//先頭数字不可。
		//予約後不可。
		
		//変数の作成と初期化。
		int b = 10;
		int c;
		
		//3.3 命名規則。
		String teacherName = "Chou Hiroshi";
		
		//3.4
		int studentAge = 15;
		System.out.println(studentAge);
		
		//一年後
		studentAge = 16;
		System.out.println(studentAge);
		
		//コンパイラエラー
		//変数名の重複
		a = 072;
		System.out.println(a);
		//072 -> 8進数。
		//09 -> 8進数。
		
		//0x -> 16進数。
		int cc = 0x1A;
		System.out.println(cc);
		
		//0b -> 2進数。
		c = 0b0100101;
		System.out.println(c);
		
		// "_" アンダースコア。
		//アンダースコアを、数字の区切りで使う事は可能。
		//先頭末尾につけるのはNG.
		int d = 123_349;
		
		//2進数。
		//bの前後には、つけない。
		int e = 0b1_111_111_111;
		System.out.println(e);
	
		
		//小数点
		//.の前後には、置けない。
		float fa = 3.14f;
		
		//コンパイルエラーにはならない。
		a = 123_456_789;
		System.out.println(a);
		//コンパイルエラーにはならない。
		b = 5__________2;
		System.out.println(b);
//		先頭にアンダースコアがある為、エラー。
//		c = _123_456_789;
//		System.out.println(c);
//		float dd = 3_.14f;
//		System.out.println(dd);
//		int ee = 0x_52;
//		System.out.println(ee);
		
	}
}
