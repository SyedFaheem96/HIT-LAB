package basic;

public class Power {

	public static void main(String[] args) {
	
		int base =3, exponent=3;
		long result=1;
		while(exponent!=0)
		{
			result*=base;
			System.out.println("Answer: "+result);
			--exponent;
			
		}
		System.out.println("Base of 3 power 3:  "+result);
		
	}

}
