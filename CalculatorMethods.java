import java.util.Scanner;

public class CalculatorMethods {
	
	public static double additionof2(double a, double b) {
		double sum = a + b;
		return sum;
	}
		
		public static double subtractionof2(double a, double b) {
			double sum = a - b;
			return sum;
	}
		public static double divisionof2(double a, double b) {
			double sum = a / b;
			return sum;
		}
		
		public static double multiplicationof2(double a, double b) {
			double sum = a * b;
			return sum;
		}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("Enter the two numbers, separated by space: ");
		
		//getting the users input foe the numbers
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("What method: add, subtract, divide, multiply ");
		
		// gets the operation the user picks
		String operation = scanner.nextLine();
		// if the user types add it will run the class for addition
		if(operation.equals("add")) {
			
			System.out.println(a + " + " + b + " = " + additionof2( a, b) );
			
		}
		// if the user types sub. it will run the class for subtraction
		else if (operation.equals("subtract")) {
			
			System.out.println(a + " - " + b + " = " + subtractionof2( a, b) );
		}
		// if the user types divide it will run the class for division
		else if (operation.equals ("divide")) {
			System.out.println(a + " / " + b + " = " + divisionof2( a, b) );
		}
		// if the user types multiply it will run the class for multiplication
		else if (operation.equals("multiply")) {
			System.out.println(a + " x " + b + " = " + multiplicationof2( a, b) );
		}
		
		
		System.out.println("Would you like to so another equation: yes or no");
		
		String user = scanner.nextLine();
		
		if(user.equals("no")) {
			System.out.println("Thank you for using the calculator");
 // stops running the code if the user answers no
			break;
			
		}
		
		
	}
		
	}
}
