class Pra
{
	public static void main(String args[])
	{
		Demo obj1=Demo.method();
        Demo obj2 =Demo.method();
//		obj1.show();

	}

} 

class Demo
{
	static int cnt=1;
	private Demo()
	{
		System.out.println("This is Private constructor");
		cnt++;
		
	}
	
	static Demo method()
	{
		return new Demo();
	}

	
}