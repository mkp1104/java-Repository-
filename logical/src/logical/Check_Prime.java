package logical;
import java.util.*;
public class Prime 
{
public static void main(String[] args) 
{	
	Scanner sc=new Scanner(System.in);
	String decider=null;

	do
	{
	System.out.println("enter the Number");

	
	int x=sc.nextInt();
	boolean flag=false;
	boolean y=true;
	for(int i=2;i<x;i++)
	{
		if(x%i==0)
		{
			flag=true;
			break;
			
		}
		
	}
	if(flag)
	{
		System.out.println("It's not a Prime Number");
		
		y=false;
	}
	if(y)
	{
	System.out.println("It's A Prime Number");
	}
	System.out.println("Want to enter more y/n");
	 decider=sc.next();
	}while("y".equals(decider));
		
}
}
