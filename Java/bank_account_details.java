class bank_acc 
{
	double acc_no = 6234.00;
	double bal = 20000;
	double interest_rate = 3.00;

	void deposit()
	{
		double amount = 20000;
		
		bal = bal + amount;
		
		System.out.println("Balance = " + bal);
	}
}

class saving_acc extends bank_acc 
{
	double minmum_balance = 500.00;

	void withdraw()
	{
		double withdraw_amount = 200;
		
		bal = bal - withdraw_amount;
		
		System.out.println("Balance = " + bal);
	}
}

class fix_deposit extends saving_acc
{
	double term = 2;

	void interest()
	{
		double interest_earned = (bal * interest_rate) / 100;
		
		bal = bal + interest_earned;
		
		System.out.println("Balance = " + bal);
	}
}

class bank_account_details
{
	public static void main(String Args[])
	{
		bank_acc b = new bank_acc();
		saving_acc s = new saving_acc();
		fix_deposit f = new fix_deposit();

		b.deposit();
		s.deposit();
		s.withdraw();
		f.deposit();
	}
}