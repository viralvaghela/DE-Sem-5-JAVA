class A
{
	static int x=5;

}
class B extends A
{
	int x=555;
	void display()
	{

		System.out.println("X in the Display():"+x);

		System.out.println("X outside Display():"+super.x);

	}

}
class Pra
{
	public static void main(String[] args) {
		B obj = new B();
		obj.display();
	}
}