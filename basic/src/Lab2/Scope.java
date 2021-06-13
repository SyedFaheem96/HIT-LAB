package Lab2;

public class Scope {

		private int i;
		public static void main(String argv[]){
		Scope s = new Scope();
		s.amethod();
		}
		public static void amethod() 
		{
		System.out.println(i);
		}
		

}
	// Answer: Compile Error; cant compile static method with non static variable