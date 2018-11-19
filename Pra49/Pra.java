	class MyExceptionFund extends Exception
	{
		MyExceptionFund(String s)
		{
			super(s);
		}
	}
	class Pra
	{
		public static void main(String[] args) throws MyExceptionFund {
			//float tmp=0;
			float balance=5000;
			int wtamount=2000;
			//tmp=wtamount;
			System.out.println("balance : "+balance);
			

			if(balance-wtamount<=0)
			{
				throw new MyExceptionFund("Sorry,Not Sufficient Fund 1");
			}
			else
				balance=balance-wtamount;
				System.out.println("After withdrawing 2000 balance:"+balance);
			
			wtamount=1500;
			//tmp=tmp+wtamount;
			
			if(balance-wtamount<=0)
			{
				throw new MyExceptionFund("Sorry,Not Sufficient Fund 2");
			}
			else
				balance=balance-wtamount;
				System.out.println("After withdraw 1500 balance :"+balance);

			wtamount=3500;
			//tmp=tmp+wtamount;
			if(balance-wtamount<=0)
			{
				throw new MyExceptionFund("Sorry,Not Sufficient Fund");
			}
			else
				balance=balance-wtamount;
				System.out.println("After withdraw 3500 balance :"+balance);

		}
	}