public class Pra8
{
	public static void main(String[] args)
	{
	/*int num=0,i=1,flag=0,j=0,	counter=0;
		int a[];
		a=new int[15]; 
		int temp=0;
		while(i<=100 && temp<=15)
		{int v=0;
			if(i%2==0)
			{
				a[j]=i;
				j++;
				counter++;
					temp++;
			}
			i++;	
		
		}

		for(j=0;j<counter;j++)
		{
			System.out.println(a[j]);
		}*/
		int i,j,flag,num,temp=0;
		for(i = 1;i <= 100;i++)
		{
			flag = 0;
			for(j = 2;j <= i/2;j++)
			{
				if(i%j==0)
					flag++;
					temp++;
					break;
				


			}
			if(flag ==0 && temp <= 30)
				System.out.println(i);
		}
} 
}