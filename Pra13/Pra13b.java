import java.lang.*;
class Pra13b
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		int r,rev=0;
		
		String sno[]={""};
		System.out.println("Value of sno is:"+sno[0]);	
		while(no>0)
		{
			r=no%10;
			no=no/10;	
			num=num+sno;
			sno=sno+num;
			//rev=rev*10+r;
		}		
		//check string after concat
	//System.out.println(num);
	}
}