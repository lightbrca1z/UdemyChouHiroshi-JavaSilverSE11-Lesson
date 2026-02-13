package DEMO1_6;

public class Output_print {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 *  %d : 整数
		 *	%f : 小数
		 *	%s : 文字列
		 *  %c : 文字
		 *  改行：\n
		 */
		int number = 5;
		System.out.printf("数字:%d\n", number);
		
		double pi = 3.14;
		System.out.printf("円周率:%.2f\n", pi);
		
		String message = "こんにちは";
		System.out.printf("メッセージ:%s\n", message);
		System.out.printf("メッセージ:%10s\n", message);
		System.out.printf("メッセージ:%-10s\n", message);
		
		char letter = 'j';
		System.out.printf("%-20s %s\n", "message:", letter);
		System.out.printf("%-20s %d\n", "number:", number);
		System.out.printf("%-20s %.2f\n", "pi:", pi);
		System.out.printf("%-20s %c\n", "letter:", letter);
		
	}
}
