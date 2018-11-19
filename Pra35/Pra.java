class SuperClass
{
	int a;
	SuperClass(int p)
	{
		a=p;
		System.out.println("Super class:"+a);
	}
}

class SubClass extends SuperClass
{
	int b;
	SubClass(int x,int y)
	{	
		super(x);
		b=y;		
		System.out.println("Sub class:"+b);
	
	}
}

class Pra
{	
	public static void main(String[] args) {
		SubClass s1 = new SubClass(10,20);
	}
}