public class Pra5
{
	public static void main(String[] s)
	{
		int [] number={30,20,10,40,50};
		int temp=0,i=0,j=0,a;



		//Sorting logic

		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(number[i]>number[j])
				{
					a=number[i];
					number[i]=number[j];
					number[j]=a;
				}
			}
		}
		for(i=0;i<5;i++)
		{
			System.out.println(""+number[i]);
		}
	}
}