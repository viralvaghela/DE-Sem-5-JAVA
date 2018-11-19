public class Pra6 
{
	public static void main(String[] args)
	{
		int a[][]={
						{5,10},
						{15,20}

					};
		int b[][]={

						{5,10},
						{15,20}
					};
		int c[][]=new int [2][2];
		int d[][]=new int [2][2];

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				 c[i][j]=a[i][j]+b[i][j];
				 d[i][j]=a[i][j]*b[i][j];
			}
		}

		//Print Sum
			System.out.println("Sum is:");
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++) 
			{
			
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}

		//print Mul
		System.out.println("Mul is:");	
			for(int i=0;i<2;i++)
			{
				for (int j=0;j<2;j++) 
				{
					
					System.out.print(d[i][j]+" ");
				}

					System.out.println("");
			}
		




	}

}