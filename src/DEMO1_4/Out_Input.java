package DEMO1_4;

import java.util.Scanner;

public class Out_Input {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//宣言と初期化。
		int userAge;
		userAge = 5;
		
		String name = "田中";
		
		//コンソールへの出力
//		System.out.println("Hello World!");
//		System.out.println(name);
		

		//コンソールからの入力
		Scanner scanner =  new Scanner(System.in); //使用していない。
		System.out.println("年齢を入力してください！");
		userAge = scanner.nextInt();
		System.out.println("あなたの年齢は" + userAge + "歳です！");
	}

}
