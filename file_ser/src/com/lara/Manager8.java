package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class J implements Serializable
{
	int x;
	J()
	{
	System.out.println("J()");
	}
	
}


public class Manager8
{
	public static void main(String[] args) throws Exception
	{
		J j1=new J();
		j1.x=100;
		Util.serialize(j1,"test7.txt");
		System.out.println("-----");
		J j2= (J)Util.deSerialize("test7.txt");
		System.out.println(j2.x);
	}
}