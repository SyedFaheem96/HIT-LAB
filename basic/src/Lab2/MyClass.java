package Lab2;

public class MyClass {

	public static void main(String arguments[]) {
		amethod(arguments);
	}
	public void amethod(String []arguments)
	{
		System.out.println(arguments);
		System.out.println(arguments[1]);
		
	}

}
//Answer:

/*Can't make static reference to void amethod.
Because main is defined as static you need to create an instance of the class in order to call
any non-static methods. Thus a typical way to do this would be.
MyClass m=new MyClass();
m.amethod();*/