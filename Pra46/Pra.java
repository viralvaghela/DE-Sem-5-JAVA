class Pra{
	public static void main(String[] args) {
		try
		{
			int a[]={1,2,3};
			a[4]=55;

		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		try{
			int a=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can not divide by 0");
		}
	}
}