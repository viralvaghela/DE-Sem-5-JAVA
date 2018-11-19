public class PRA3
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			 int no=Integer.parseInt(args[i]);
			 sum= sum + no;
		}

		float avg=sum/5;
		System.out.println("Sum is :" +sum );
		System.out.println ("Average is:" +avg);

	}
}