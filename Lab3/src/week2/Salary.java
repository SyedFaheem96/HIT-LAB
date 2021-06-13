package week2;

import java.util.Scanner;
import java.text.NumberFormat;
public class Salary {

	public static void main(String[] args) {
		double currentSalary;
		double raise=500;
		double newSalary=0;
		String rating;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the current Salary: ");
	currentSalary = scan.nextDouble();
	System.out.println("Enter the performance Rating (Excellent,Good or Poor)");
	rating=scan.nextLine();
	newSalary=currentSalary+raise;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	System.out.println();
	System.out.println("Current Salary: "+money.format(currentSalary));
	System.out.println("Amount of Raise: "+money.format(raise));
	System.out.println("New Salary: "+money.format(newSalary));
	System.out.println();
	
	}
	

}
