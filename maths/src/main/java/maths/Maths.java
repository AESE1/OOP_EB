package maths;

public class Maths {

	public static void main(String[] args) {
		
		System.out.println(add(10,10));
		System.out.println(subtract(20, 10));
		System.out.println(divide(10, 2));
		System.out.println(multiply(10, 10));
	}
		
		public static double add (double n1, double n2) {
		return n1 + n2;

	}

		public static double subtract (double n1, double n2) {
			return n1 - n2;

		}
		public static double divide (double n1, double n2) {
			if (n2 == 0)
				throw new ArithmeticException("Divison by zero");
			return n1 / n2;

		}
		public static double multiply (double n1, double n2) {
			return n1 * n2;

		}
		
}
