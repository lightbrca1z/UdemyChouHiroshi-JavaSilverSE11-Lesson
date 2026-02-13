package DEMO2_8_CaseStudy;

import java.util.Scanner;

public class CaseStudy01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int d = 0;
		int a,b;
		int c;
		int max;
		
		//コンソールからの入力
		Scanner scanner =  new Scanner(System.in); //使用していない。
		System.out.println("aを入力してください！");
        a = scanner.nextInt();

        System.out.println("bを入力してください！");
        b = scanner.nextInt();

        System.out.println("cを入力してください！");
        c = scanner.nextInt();
//		if ( a > b) {
//			d = Math.max(a, c);
//		}
//		else if (a <= b) {
//			d = Math.max(b, c);
//		}
//		max = d;
        d = (a > b) ? Math.max(a, c) : Math.max(b, c);
        // d = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        max = d;
		System.out.println("最大値は" + max + "です！");
		
// if文を沢山使う事は、可読性で良くない。
		
	}

}
