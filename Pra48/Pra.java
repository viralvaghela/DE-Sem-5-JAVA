class MyExceptionZero extends Exception
{
	MyExceptionZero(String s)
	{
		super(s);
	}

}

class Pra
{

	public static void main(String[] args) throws MyExceptionZero
	 {
		int b=0;
		int a=10;
		if (b==0) {
			throw new MyExceptionZero("Sorry,can not divide by zero");
		}
		else
			a=a/b;
			System.out.println(a);
		
	  }
	
}