package DEMO2_8_CaseStudy;

import java.util.Scanner;

public class CaseStudy02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 0;
		int b,c,d = 0;
		Scanner scanner =  new Scanner(System.in); //使用していない。
	    while (true) {
            System.out.println("演算する3桁の数字を入力して下さい！");
            a = scanner.nextInt();

            // 3桁ならループを抜ける
            if (Math.abs(a) >= 100 && Math.abs(a) <= 999) {
                break;
            }

            // 3桁じゃないなら再入力
            System.out.println("エラー：3桁の数字ではありません。もう一度入力してください。");
        }
	    b = a % 10;
	    c = (a / 10) % 10;
	    d = a / 100;

	    System.out.println("100の位は、" + d + "です！");
	    System.out.println("10の位は、" + c + "です！");	    
	    System.out.println("1の位は、" + b + "です！");

	}

}
