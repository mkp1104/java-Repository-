package com.lara;
class  W
{
	static void test() throws ClassNotFoundException
	{
			System.out.println(1);
		//	int i=10/0;
		Class.forName("");		
			System.out.println(2);
	}
}
public class N
{

	public static void main(String[] args) 
	{
		System.out.println(3);
			W w1=new W();
			
					
			try
			{	
		System.out.println(3);
			w1.test();
			
		System.out.println(5);
			
				}
			catch(ClassNotFoundException ex)
		{
			System.out.println(6);	
		}
		System.out.println(7);
			}
			
		}
