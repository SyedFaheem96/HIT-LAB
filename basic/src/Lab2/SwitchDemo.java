package Lab2;

public class SwitchDemo {

	public static void main(String[] args) {
		int i=9;
		switch(i)
		{
		default:
			System.out.println("Default");	
			
		case 1: 
			System.out.println("One Printed");
		break;
		case 2: 
			System.out.println("Two Printed");
		break;
		case 3: 
			System.out.println("Three Printed");
		break;
		//break;
		}
	}

}


//Question 12--->Answer:  One Printed

//Question 13---> If i=9 then print default and case 1 statement 
//if break statement is missed case 1 statement also printed
//Answer 13--> Default, one printed