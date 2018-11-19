/*
	Two threads////
	1st print ODD &
	2nd Print EVEN


*/
class Thr extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=50;i++)
			{

				if(Thread.currentThread().getName()=="odd")
				{
					if(i%2!=0)
					{
						System.out.println("Odd ->"+i);
						sleep(200);
					}
				}
                if(Thread.currentThread().getName()=="even")
                {
					if(i%2==0)
					{
                  	  System.out.println("EVEN -->"+i);
							sleep(200);
					}
                }

			}
		}catch(Exception x){}
	}
}

class Pra
{
	public static void main(String[] args) {
		Thr odd = new Thr();
		Thr even  = new Thr();
		odd.setName("odd");
		even.setName("even");
		odd.start();
		even.start();	
	}
}