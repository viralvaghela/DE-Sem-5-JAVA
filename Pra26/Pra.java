class Account
{
	//Declaration of Data Members
	private String Name,actype;
	private int acno;
	private float balance;
	//Initializaion using Constructor
	Account()
	{
		Name="Viral";
		actype="Saving Account";
		acno=12345;
		balance=5000;
	}
	//method to deposite Balance
	void deposite(float amount)
	{
		if(balance>1000 )
		{
			float BalanceAfterDeposite=balance-amount;
			if(BalanceAfterDeposite>1000) //check that,after deposite balance should not be <1000
				balance=balance-amount;	
			else
				System.out.println("Please enter valid amount because balance after deposite,Your balance should be more than 1000");
		}
		else //print Error message
			System.out.println("Sorry,To deposite your Account balance must be 1000");
	}
	void display()
	{
		System.out.println("Name Of Depositer:"+Name);
		System.out.println("balance:"+balance);
		System.out.println("Account Number:"+acno);
		System.out.println("Account Type:"+actype);
	}
}
class Pra
{
	public static void main(String args[])
	{	
		Account ac1 = new Account();
		ac1.deposite(1000);
		ac1.display();
	}
}