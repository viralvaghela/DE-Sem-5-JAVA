
class Parent
{
	public int a=5;
	private int b=10;
	protected int c=15;
}
class Child extends Parent
{
	void display()
	{
		//	System.out.println(b);
		System.out.println("public A in Child:"+a);
		//System.out.println("Private B:"+b);
		System.out.println("protected C in Child:"+c);
	}
}

class Visib
{
	public static void main(String[] args) {
		
		Parent ob=new Parent();
		
		System.out.println("Public A in main :"+ob.a);
		//System.out.println("B:"+ob.b);
		//	System.out.println("Protected C in main:"+ob.c);

		Child obj =new Child();
		obj.display();

	}
}