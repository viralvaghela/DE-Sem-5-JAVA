class Pra
{
	public static void main(String args[])
	{
	   	int no=10;
		int fee=5000;
		Demo obj=new Demo(no,fee);
	}
}

class Demo
{
	private int no;
	private int fee;

	Demo(int no,int fee)
	{
		this.no=no;
		this.fee=fee;
System.out.flush();
		System.out.println(+no);
	
	}
}
