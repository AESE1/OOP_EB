package results;

public class Results {
	
	public static double Physics = 100;
	public static double Chemistry = 90;
	public static double Biology = 80;
	public static double Total = Physics + Biology + Chemistry;
	public static double Percentage = (Total*100)/450;
		
	public static void main(String[] args) {
		
		examResults();
		overallPercentage();

	}
	
	public static void examResults() {
		System.out.println("Your Physics result is - " + Physics);
		System.out.println("Your Chemistry result is - " + Chemistry);
		System.out.println("Your Chemistry result is - " + Biology);
	}
	
	public static void overallPercentage() {
		
		System.out.println("Your overall percentage is - " + Percentage + "%");
		
		if (Percentage >= 60) {
			System.out.println("You have passed!");
		}
			else {
				System.out.println("You have failed!");
			}
		
}
}
