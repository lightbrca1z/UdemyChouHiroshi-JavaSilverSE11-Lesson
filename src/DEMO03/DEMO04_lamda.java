package DEMO03;

public class DEMO04_lamda {

	interface Greeting{
		String sayHello(String name);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 4. ラムダ式
		Greeting greetingFunction = name -> "HelloWorld "+name + "!";
		System.out.println(greetingFunction.sayHello("IwamotoTateatsu"));
	}
}
