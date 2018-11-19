class A
{
	void showA()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	void showB()
	{
		System.out.println("Class B");
	}
}

class C extends A
{
	void showC()
	{
		System.out.println("Class C");
	}
}



class Pra
{	
	public static void main(String args[])
	{
		C obj1 = new C();
		obj1.showC();
		obj1.showA();

		B obj2=new B();
		obj2.showB();
		obj2.showA();
	}

}