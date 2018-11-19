public class Pra9
{
	public static void main(String args[])
	{
		int i,t1=0,t2=1;
			System.out.println("First 5 Terms of fibonacci:");

		for(i=0;i<5;i++)
		{

			System.out.println(t1);
			int nxt=t1+t2;
			t1=t2;
			t2=nxt;

		}
	}
}