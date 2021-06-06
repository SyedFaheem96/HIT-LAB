package basic;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int first=150, Second=200;
		System.out.println("--BEFORE SWAPPING--");
		System.out.println("First Number: "+first);
		System.out.println("Second Number: "+Second);
		
		int temporary=first;
		first=Second;
		Second=temporary;
		System.out.println("--AFTER SWAPPING--");
		System.out.println("First Number: "+first);
		System.out.println("Second Number: "+Second);
		
	/*	
		temporary=150
		first= second(200);
		second= temporary that is first(150)
		
		*/
		
	}

}
