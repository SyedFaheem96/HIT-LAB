package basic;

public class SwapNumbers {

	public static void main(String[] args) {
		int first=100, second=220;
		System.out.println("---BEFORE SWAPPING---");
		System.out.println("First Number: "+first);
		System.out.println("Second Number: "+second);
		
		first=first-second;
		second=first+second;
		first=second-first;
		
		//first=second-first;
		System.out.println("---AFTER SWAPPING---");
		System.out.println("First Number: "+first);
		System.out.println("Second Number: "+second);
		
		
		
	}

}
