public class BankAccount {
	private static long generatedAccountNumber = 100000001L;
	
	private int balance;
	private int accountNumber;
	private accountHolder accountHolder;
	
	
	public BankAccount(int balance, int accountNumber, int pin, accountHolder accountHolder)
	{
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	public accountHolder getAccountHolder()
	{
		return accountHolder;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void setBalance (int balance)
	{
		this.balance = balance;
	}
	
	public void setaccountHolder (accountHolder accountHolder)
	{
		this.accountHolder = accountHolder;
	}
	
	public void setaccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public int deposit(int amount) {
		if (amount <= 0) {
			return 0;
		} else {
			balance = balance + amount;
			
			return 1;
		}
	}
	
	
	public int withdraw(int amount) {
		if (amount > balance) {
			return 0;
		} else if (amount <= 0) {
			return 1;
		} else {
			balance = balance - amount;
			
			return 2;
		}
	}
}
	
