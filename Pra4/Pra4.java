public class Pra4
{
	public static void main(String[] args)
	{
	 	int max=Integer.parseInt(args[0]);
		for(int i=0;i<10;i++)
		{
			 int no=Integer.parseInt(args[i]);
			

			 if(no> max)
				{
					max=no;
				}

		}

		System.out.println("Max:"+max);	
		
	}
}