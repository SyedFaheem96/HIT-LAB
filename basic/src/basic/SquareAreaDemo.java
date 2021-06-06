package basic;

import java.util.Scanner;

public class SquareAreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the side of the Square:");
		double side=scanner.nextDouble();
		double area=side*side;
		System.out.println("AREA OF SQUARE:"+area);
		
	}

}
