class Pra
{
	public static void main(String s[])
	{
		Demo obj = new Demo();
		System.out.println("A = "+obj.x);
		// obj.x=10; it will show error" cannot assign a value to final variable x"	
	}
}


class Demo
{
	final int x=55;
}