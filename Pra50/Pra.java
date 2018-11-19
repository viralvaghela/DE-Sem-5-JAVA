/*
	Thread I - 2500
	Thread II - 5000
	Thread II - 7500
*/
class Thr extends Thread
{
	public void run()
	{
			try{
				while(true)
				{
					if (Thread.currentThread().getName()=="thr1") {
						System.out.println("Thread - I");
						sleep(2500);
					}
					 if(Thread.currentThread().getName()=="thr2")
					{
						System.out.println("Thread - II");
						sleep(5000);
					}
					if(Thread.currentThread().getName()=="thr3")
					{
						System.out.println("Thread = III");
						sleep(7500);
					}

				}
			}catch(Exception e)
			{}	
	}
}

class Pra
{
	public static void main(String[] args) {
		Thr obj1 = new Thr();
		Thr obj2 = new Thr();
		Thr obj3 = new Thr();
		obj1.setName("thr1");
		obj2.setName("thr2");
		obj3.setName("thr3");
		
		obj1.start();
		obj2.start();
		obj3.start();
		
		
	}
}