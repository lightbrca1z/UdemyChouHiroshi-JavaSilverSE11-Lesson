package DEMO1_4;

public class MakeName {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
	/*
	 * 変数の命名規則
	 * 命名の一貫性。
	 * 短すぎず長すぎない名前。
	 * 大文字の使用を避ける。
	 * アンダースコアの使用を避ける。
	 * 予約語の回避。
	 * 意味のある区別。
	 */
		
	
	/*
	 * 変数の命名規則1
	 * 先頭に0をつけない。
	 * キャメルケースの遵守。
	 * アンダースコアを適切に使用。
	 * 意義のある英語を使用。
	 */
		
	/*
	 * 命名の一貫性。
	 */
//	 社員数。 
	int a = 5;
	int employeeCount = 5;
	
//	 給料。
	int salary = 300000;
	int juniorSalary = 300000;
	int seniorSalary = 300000;
	
	
	/*
	 * 短すぎず長すぎない名前
	 */
		int studentI;
		int studnetIndex;
		
	/*
	 * 大文字の使用を避ける。
	 */
	
	String StudentName; //NG
	String studentName; //OK;
	
	/*
	 * アンダースコアの使用を避ける。
	 */
	
	//定数は、全部大文字。
	//キャメルケースの使用。
	int my_var; // NG
	int myVar; // OK
	
	/*
	 * 	予約語の回避。
	 */
	
	// String String = "" -> NG.予約語
	// String Public = "" -> NG.予約語
	
	/*
	 * 	意義のある英語を使用。
	 */
	
	//送信者
	//受信者
	
	int user1, user2; // -> 名前が分かりにくい。
		
	//送信者
	int senderUser; // -> 分かりやすい。
	//受信者
	int receiverUser; // ->　分かりやすい。
	
}
	
	

}
