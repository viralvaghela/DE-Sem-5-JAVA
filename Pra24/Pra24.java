class Demo
{
	static Demo i=null;
	static int count=0;
	
	Demo()
	{
		 count++;
	}
	private Demo(int j)
	{
		count++;
		System.out.println("\nprivate constructors:"+j);
	}
	static Demo GetObj(int c)
	{
		if(i==null)
		{
			i=new Demo(c);
		}
		return i;
	}
	static void show()
	{
		System.out.println("total number of objects:"+count);
	}
	

}
class Pra24
{
	public static void main(String[] args)
	{
		Demo p1=new Demo();
		Demo p2=new Demo();
		Demo.show();
		Demo ob1=Demo.GetObj(1);
		Demo ob2=Demo.GetObj(2);
		Demo.show();
	}
}