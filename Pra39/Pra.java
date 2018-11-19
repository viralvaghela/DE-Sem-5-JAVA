final class A{
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


class Pra{

	 public static void main(String[] args) {
			B obj = new B();
			obj.showA();
	} 
}
