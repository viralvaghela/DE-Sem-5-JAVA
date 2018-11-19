class Pra
{
	public static void main(String[] args) {
		try
		{
			//int arr[] = new int[4];
			
			int arr[]={10,20,30,40,50};
			
			arr[100]=100;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error :=> Array Index Out Of Bounds Exception");
		}
	}
}