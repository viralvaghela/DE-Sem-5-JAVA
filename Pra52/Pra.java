/*
	2 Threads 
	1st print divisible by 3
	2nd print divisible by 5
*/
class Div extends Thread
{
	 synchronized public void run()
	{
		try
		{
			for (int i=1;i<=50;i++ ) {
				if((Thread.currentThread().getName()=="odd"))
				{	
					if(i%3==0)
					{		System.out.println("Divisible By 3 ->"+i);	
							sleep(1000);
					}
				}
				if((Thread.currentThread().getName()=="even"))
				{	
					if(i%5==0)
					{
						System.out.println("Divisible By 5->"+i);
						sleep(1000);
					}
				}		
			}
			
		}catch(Exception e){}
	}
}

class Pra
{
	public static void main(String[] args) {
		Div odd = new Div();
		Div even = new Div();

		odd.setName("odd");
		even.setName("even");
 		odd.start();
		even.start();
	}
}