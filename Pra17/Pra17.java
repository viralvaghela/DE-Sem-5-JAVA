public class Pra17
{
	public static void main(String arg[])
	{
		MethodOverloading obj=new MethodOverloading();
		obj.Prin();
		obj.Prin(1);
		obj.Prin(10.50);
	}
	
}

class MethodOverloading
{
	void Prin()
	{
		System.out.println("Method without returntype & args");
	}
	
	void Prin(int a)
	{
		System.out.println(a);
	}

	void Prin(float a)
	{
		System.out.println(a);
	}
}
