package basic;
import java.util.Scanner;

public class AreaofRectangle {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Length");
int length=sc.nextInt();

Scanner $sc2=new Scanner(System.in);
System.out.println("Enter the width");
int width= $sc2.nextInt();
int area=length*width;
System.out.println("AREA OF RECTANGLE:"+area);


}
}
