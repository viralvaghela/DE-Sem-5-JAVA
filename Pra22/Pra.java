class Pra
{
	public static void main(String args[])
	{
		StaticExample.v();
		System.out.println("Static int a:"+StaticExample.a);
	}
}

class StaticExample{
	static int a=50;
	static void v()
	{
		System.out.println("I am Static Method");	
	}
}
