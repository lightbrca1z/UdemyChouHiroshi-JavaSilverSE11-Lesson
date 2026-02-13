package DEMO3_5_CaseStudy;

import java.util.Scanner;

public class CaseStudy02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//コンソールからの入力
		Scanner scanner =  new Scanner(System.in); //使用していない。
		System.out.println("年を入力してください！");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))  {
        	System.out.println("うるう年");
        }else {
        	System.out.println("平年");
        }

        // 次のうるう年を探す（year + 1 から）
        int nextYear = year + 1;

        while (!((nextYear % 4 == 0 && nextYear % 100 != 0) || (nextYear % 400 == 0))) {
            nextYear++;
        }

        System.out.println("次のうるう年は " + nextYear + "年です。");

        scanner.close();
	}

}
