interface P
{
	String s="Hello World In Interface";
	void dispP();
}

class Q implements P
{
	public void dispP()
	{
		System.out.println(s);
	}
	
	
}
class InterfaceExample
{
	public static void main(String arg[])
	{
		Q q=new Q();
		q.dispP();
		
	}
}