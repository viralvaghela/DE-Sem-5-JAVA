package P1;
public class A
{
	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;

	public void showA()
	{
		System.out.println("In method A");
		System.out.println("No modifier A:"+a);
		System.out.println("Public b:"+b);
		System.out.println("private c:"+c);
		System.out.println("protected d:"+d);
	}
}

class B extends A{
	public void showB()
	{
		System.out.println("In method B");
		System.out.println("No modifier A:"+a);
		System.out.println("Public b:"+b);
		//System.out.println("private c:"+c);
		System.out.println("protected d:"+d);	
	}
}

