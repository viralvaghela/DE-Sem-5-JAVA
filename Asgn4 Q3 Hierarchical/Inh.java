class A
{
	int a=5;

}

class B extends A
{
	void show_B()
	{
		System.out.println("A in class B:"+a);
	}
}

class C extends A
{
	void show_C()
	{
		System.out.println("A in class C:"+1a);
	}

}

class Inh
{
	public static void main(String[] args) {
		B obB =new B();
		obB.show_B();
		C obC = new C();
		obC.show_C();

	}
}		