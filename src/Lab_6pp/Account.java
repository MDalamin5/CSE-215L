package Lab_6pp;

public class Account {
	private int accountNumber;
	private double balance;
	
	Account()
	{
		accountNumber=12345;
		balance= 0;
	}
	Account(int accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	Account(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void caedit(double amount)
	{
		balance += amount;
	}
	
	public void debit(double amount)
	{
		if(balance>= amount)
		{
			balance = balance-amount;
			System.out.println("YOur balance is: "+balance);
		}
		else
		{
			System.out.println("Amount withdrawn exceeds the courrent balance!");
		}
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance= $" + balance + "]";
	}
	
	

}
