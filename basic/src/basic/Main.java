package basic;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    char operator;
    double number1,number2,result;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Choose an Operator: + ,-,*,or /" );
    operator=scanner.next().charAt(0);
    System.out.println("Enter first Number:");
    number1=scanner.nextDouble();
    System.out.println("Enter first Number:");
    number2=scanner.nextDouble();
    
    switch(operator)
    {
    	case'+':
    		result=number1+number2;
    		System.out.println(number1+"+" +number2+ "=" +result);
    		break;
    		
    	case'-':
    		result=number1-number2;
    		System.out.println(number1+"-"+number2+"="+result);
    		break;
    	
    	case'*':
    		result=number1*number2;
    		System.out.println(number1+"*"+number2+"="+result);
    		break;
    	
    	case'/':
    		result=number1/number2;
    		System.out.println(number1+"/"+number2+"="+result);
    		break;
    	default:
    		System.out.println("Invalid Operator");
    		break;
    		
    }
    
	}

}
