public class Pra18
{
	public static void main(String args[])
	{
		ConstOverLoading obj1 = new ConstOverLoading();
		ConstOverLoading obj2 = new ConstOverLoading(5);
		ConstOverLoading obj3 = new ConstOverLoading(10.50);
		ConstOverLoading obj4 = new ConstOverLoading('V');

	}

}

class ConstOverLoading
{
	int a;
	double d;
	char str;

	ConstOverLoading()
	{
		System.out.println("Constructor without args");
	}

	ConstOverLoading(int a)
	{
		this.a=a;show(a);
	}

	ConstOverLoading(double d)
	{
		this.d=d;
		show(d);
	}

	ConstOverLoading(char s)
	{
		str=s;
		show(str);

	}
		
	
		
	//System.out.println(s);
	
	/* All show methods*/
	void show(double d)
	{
		System.out.println(d);
	}

	void show(int a)
	{
		System.out.println(a);
	}

	void show(char str)
	{
		System.out.println(str);
	}
}