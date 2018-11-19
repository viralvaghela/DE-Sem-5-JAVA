class Prac13
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		int r,rev=0;
		while(no>0)
		{
			r=no%10;
			no=no/10;
			rev=rev*10+r;
		}
		while(rev>0)
		{
			r=rev%10;
			rev=rev/10;
			switch(r)
			{
				case 0 : System.out.print("Zero "); 
				break;
				case 1 : System.out.print("ONE "); 
				break;
				case 2 : System.out.print("TWO "); 
				break;
				case 3 : System.out.print("THREE "); 
				break;
				case 4 : System.out.print("FOUR "); 
				break; 
				case 5 : System.out.print("FIVE "); 
				break;
				case 6 : System.out.print("SIX "); 
				break;
				case 7 : System.out.print("SEVEN "); 
				break;
				case 8 : System.out.print("EIGHT "); 
				break;
				case 9 : System.out.print("NINE "); 
				break;
				case 10 : System.out.print("TEN "); 
				break;
				
			}
		}
	}
}	