interface GrandparentIP
{
	default void show()
	{
		System.out.println("Default GPI");
	}
}

interface Parent1 extends GrandparentIP
{

}

interface Parent2 extends GrandparentIP
{

}

class A implements Parent1,Parent2
{
	public static void main(String[] args) {
		A d=new A();
		d.show();
	}
}