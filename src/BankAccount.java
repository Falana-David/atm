public class BankAccount<accountHolder> {

	

	private static long generatedAccountNumber = 100000001L;

	

	private long accountNumber;

	private double balance;

	private accountHolder accountHolder;


	

	public BankAccount(double balance, accountHolder accountHolder) {

		this.accountNumber = BankAccount.generatedAccountNumber++;

		this.balance = balance;

		this.accountHolder = accountHolder;

	}

	


	public long getAccountNumber() {

		return accountNumber;

	}

	


	public double getBalance() {

		return balance;

	}


	public accountHolder getAccountHolder() {

		return accountHolder;

	}

	


	public void setAccountNumber(long accountNumber) {

		this.accountNumber = accountNumber;

	}


	public void setBalance(double balance) {

		this.balance = balance;

	}

	

	public void setaccountHolder(accountHolder accountHolder) {

		this.accountHolder = accountHolder;

	}

	


	public int deposit(double amount) {

		if (amount <= 0) {

			return 0;

		} else {

			balance = balance + amount;

			

			return 1;

		}

	}

	

	public int withdraw(double amount) {

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

