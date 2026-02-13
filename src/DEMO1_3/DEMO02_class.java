package DEMO1_3;

public class DEMO02_class {

	public static class Greeting{
		public void printHelloWorld(){
			System.out.println("Hello World");
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			String greeting = "こんにちは、世界！";
			System.out.println(greeting);
			
			Greeting myHelloWorld = new Greeting();
			myHelloWorld.printHelloWorld();
		}

	}
