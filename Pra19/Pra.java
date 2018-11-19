class Demo{
	int i,j;

	Demo(int x)
	{
		i=x;
	
	}

	void fun(Demo o)
	{
		if(o.i==10)
			//print true if i==10 else print false
			System.out.println("True");
		else
			System.out.println("False");
	}
}



class Pra
{
	public static void main(String args[])
	{
		Demo obj1 = new Demo(25);
		Demo obj2 = new Demo(10);
		obj1.fun(obj2);
	}
}
