public class Pra13
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		
		String []one= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
						"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen,Eighteen","Ninteen"};
		
		String []tens={"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String []hundred={"hundred","Thousand",""};
		if(no>99 || no<0)
			System.out.println("Enter Number between 1-99");
		else
		{
			if(no>0 && no<20)
			{
				System.out.println(one[no]);
			}
			if(no>19 && no<100)
			{
				int leftdigit=no/10;
				int rightdigit=no%10;
				System.out.println("You have entered is:"+tens[leftdigit-2]+" "+one[rightdigit]);
			}
		}
	}
}