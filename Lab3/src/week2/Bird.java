package week2;

public class Bird {

	int age;
	String name;
	Bird()
	{
		System.out.println("This is Parrot ");
		
	}
	Bird(String x)
	{
		name=x;
	System.out.println("This is the : "+name);
	
	}
	Bird(int y,String z)
	{
		age=y;
		name=z;
		System.out.println("This is the "+age+"year\t"+name);
	}
	public static void main(String[] args) {
		Bird a=new Bird();
		
			
		Bird b=new Bird("Maina");
		Bird c=new Bird(20,"Sparrow");
		

	}

}
