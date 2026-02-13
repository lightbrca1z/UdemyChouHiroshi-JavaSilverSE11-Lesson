package DEMO1_3;

public class DEMO03_interface {

	
	interface Greeting{
		void print();
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 3. interface
		Greeting printer = new Greeting() {
			@Override
			public void print() {
				System.out.println("Hello, World!");
			}
		};
		printer.print();
	}
}
