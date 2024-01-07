import java.util.Scanner;

public class AverageWithholding {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int weeklyIncome;
		double taxRate;
		int averageWithholding;
		
		System.out.println("Please enter weekly income amount: ");
		weeklyIncome = scnr.nextInt();
		
		//The if-else structure allows the program to choose the tax rate based on input.
		if (weeklyIncome < 500) {
			taxRate = 0.10;
		}
		else if (weeklyIncome <= 1499) {
			taxRate = 0.15;
		}
		else if (weeklyIncome <= 2499) {
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		
		//Now we add the formula for Average Withholding and then print out all the information that was inputed.
		averageWithholding = (int)(weeklyIncome * taxRate);
		System.out.println("Weekly Income: $" + weeklyIncome);
		System.out.println("Tax Rate: " + taxRate + "%");
		System.out.println("Average Withholding: $" + averageWithholding);

	}

}
