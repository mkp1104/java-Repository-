package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
public class Manager33
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(9);
		list1.add(0);
		list1.add(40);
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.println(obj);
			if(obj.equals(9))
			{
			it.remove();	
			}
		}
		
		System.out.println(list1);
	}
}
