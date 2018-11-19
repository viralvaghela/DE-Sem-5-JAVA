class AOfC
{	
	double pi=3.14;
	double radius;
	AOfC(double r)
	{
		radius=r;
	}
 	void ans()
 	{
 		double result=2*pi*radius;
 		System.out.println("Area of Circle is:"+result);
 	}
}
class Pra
{
	public static void main(String args[])
	{
		

		AOfC obj=new AOfC(5);
		obj.ans();
	}
}









