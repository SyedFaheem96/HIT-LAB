package basic;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num;i++)
		{
			temp= num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}

		if(isPrime)
		{
			System.out.println(num+":is a prime Number");
		}
			else
			{
		     System.out.println(num+":not a prime Number");
			
		}
			
	}

}
