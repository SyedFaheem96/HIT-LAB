package week2;

public class Employee {

	int empId;
	String empName;
	
	Employee(int id, String name)               // constructor 
	{
		this.empId=id;
		this.empName=name;
		System.out.println("Id:"+empId +"Employee Name: "+empName);
			
	}
	void info()                                   // Method 
	{
		System.out.println("Method function : "+"Id:"+empId +"Employee Name: "+empName);
		//System.out.println("");
	
	}
	public static void main(String[] args) {
		Employee obj1=new Employee(7047,"Syed Faheem B");   //create object for constructor that will calls automatically 
		Employee obj2=new Employee(7087,"Syed Ibrahim B");
		//obj1.info();
	//	obj2.info();            //calling method
		
		 
	}

}


