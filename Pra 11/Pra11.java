//import java.util.Scanner;
class Pra11
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]), rev=0;
		int real=n;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter any number to Reverse: ");
//		n=sc.nextInt();
		
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
			if(rev==real)
				System.out.println("Palindrome");
			else
				System.out.println("Not palindrome");

		//
	}
}