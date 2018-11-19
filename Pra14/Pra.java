class Pra
{
	public static void main(String args[])
	{
		System.out.println("I am in the main");
		N obj1=new N();
		//obj1.fun(10);
		int no=Integer.parseInt(args[0]);
		obj1.fun(no); 
	}	
}
class N
{
	void fun(int a)
	{
		System.out.println("Value of A:"+a);
	}
}