package mb.app10.src;

class L 
{

	L(int i,int j)
	{
	System.out.print("L(int,int)");
	}
	L(int i,double j)
	{
	System.out.println("L(int,double)");
	
	}
	public static void main(String[] args) 
	{
        L obj1=new L(10,20);
        System.out.println("-----");
		L obj3=new L(10,2.0);
		System.out.println("-----");
	}
}
