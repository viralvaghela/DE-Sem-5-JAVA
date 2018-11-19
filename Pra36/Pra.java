/** Program:explain method overloading
	Date:16/8/18
	Time:11:53 PM
		
*/	
class SuperClass
{	
	void show()
	{
		System.out.println("I am Super Class");
	}

}

class SubClass extends SuperClass
{	
	void show()
	{
		super.show();
		System.out.println("I am Sub Class");
	}
}

class Pra
{
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.show();

	}
}