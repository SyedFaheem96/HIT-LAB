package basic;
import java.util.Scanner;

public class CircleDemo {
	
	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		System.out.println("Enter the Radius");
		double radius=scanner.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("AREA OF CIRCLE :"+area);
		double circumference=Math.PI*2*radius;
		System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS : "+circumference);
			
	}

}
