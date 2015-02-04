package logical;
import java.util.*;
public class Prime 
{
 public static void main(String[] args) 

{
	
	System.out.println(" Prime Numbers up to ..");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	for(int i=2;i<x;i++)
	{
	    if(isPrime(i))
	    {
	        System.out.println(i);
	        
	    }
	}
}
    public static boolean isPrime(int num)
    {
        boolean flag=true;
        for(int x=2;x<num;x++)
        {
            if(num%x==0)
            {
                flag=false;
                break;
                
            }
          
        }
          return flag;
        
    }
}
