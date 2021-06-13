package Lab2;

public class ConcateString {

	public static void main(String[] args) {
		
		String s=new String("Bicycle");
		
		int iBegin=1;
		char iEnd=3;
		System.out.println(s.substring(iBegin,iEnd));   // Question 27: Answer: ic 
		
		
		String s1=new String("Hello");
				String s2=new String("there");
				String s3=new String();
		s3=s1+s2;
		System.out.println(s3);   // Question 28: Answer: Hellothere
		
		System.out.println(4 | 5);
	}

}
