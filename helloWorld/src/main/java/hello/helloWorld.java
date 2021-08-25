package hello;

public class helloWorld {

		
	public static void main(String[] args) {
		
		hello2("Anton");
		
		
		System.out.println("Hello World");
		
		String name = "Hello World";
		
		System.out.println(name);
		
		System.out.println(sayHello());
	
	}


	
	private static void hello2(String name) {
		System.out.println("Hello my name is " + name);
		
	}



	public static String sayHello () {
		return "Hello Anton";
	}
	}
	
	

