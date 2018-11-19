/*
	Read two string from CLI and check euality using method
*/

class Pra
{
	public static void main(String args[])
	{
			StringB s1=args[0];
			String s2=args[1];
			if(s1.equals(s2))
			{
				System.out.println("Both Strings are same");
			}			
			else {
				System.out.println("String are not same");
			}
	}

}