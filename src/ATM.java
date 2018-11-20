import java.util.Scanner;



public class ATM {

	private Scanner in;

	

	private BankAccount bankAccount;

	

	public ATM(BankAccount bankAccount) {

		this.bankAccount = bankAccount;

	}



	public static void main(String args[]) {

		ATM atm = new ATM(

				new BankAccount(0, new accountHolder(1234,"David Falana","September 18, 2001",	"123 street"))	);



		atm.run();

	}

	

	public void run() {

		in = new Scanner(System.in);

		boolean secure = false;

		

		while(!secure) {

			System.out.print("Account # : ");

			long accountNumber = in.nextLong();

			System.out.print("    PIN # : ");

			int PIN = in.nextInt();

			if (this.bankAccount.getAccountNumber() == accountNumber && 1234 == PIN) {

				secure = true;

			}

			else {

				System.out.println("Invalid account number and/or PIN.");

			}

		}

		

		System.out.print("\nHi " + "! What can I help you with?");

		

		menu();

	}

	

	public void menu() {

		in = new Scanner(System.in);

		int menu = 0;

		

		System.out.print("\n\n   [1] Deposit\r\n" + 

				"   [2] Withdraw\r\n" + 

				"   [3] View Balance\r\n" + 

				"   [4] Exit\r\n" + 

				"\r\n" + 

				"Make a selection: ");

		

		while(menu == 0) {

			switch(in.nextInt()) {

			case 1:

				System.out.print("\nDepositing Money.\r\n" + 

						"\r\n" + 

						"Enter Amount: ");

				double deposit = in.nextDouble();

				

				if(this.bankAccount.deposit(deposit) == 0) {

					System.out.print("\nAmount must be greater than $0.00.");

				} else {

					System.out.print("\nDeposited $" + deposit + ". Updated balance is $" + this.bankAccount.getBalance() + ".");

				}

				

				menu();

			case 2:

				if (this.bankAccount.getBalance() == 0) {

					System.out.print("\nYou don't have any money to withdraw.");

				}

				else {

					System.out.print("\nWithdrawing some money.\r\n" + 

							"\r\n" + 

							"Enter Amount: ");

					

					double withdraw = in.nextDouble();

					

					if(this.bankAccount.withdraw(withdraw) == 2) {

						System.out.print("\nWithdrew $" + withdraw + ". Updated balance is $" + this.bankAccount.getBalance() + ".");

					} 

					else if(this.bankAccount.withdraw(withdraw) == 1) {

						System.out.print("\nAmount must be greater than $0.00.");

					} 

					else {

						System.out.print("\nInsufficient funds.");

					}

				}



				menu();

			case 3:

				System.out.print("\nCurrent balance is $" + this.bankAccount.getBalance() + ".");

				menu();

			case 4:

				System.out.print("\nGoodye!");

				break;

			default: 

				menu();

			}

		}

		in.close();

	}	

}