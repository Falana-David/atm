import java.util.Scanner;
public class ATM {
	private Scanner in;
	private BankAccount account;
	private BankAccount bankAccount;
	private static int balance;
	public static String name;
	
	public ATM(BankAccount account)
	{
		this.account = account;
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM(new BankAccount(0, 0, 0, new accountHolder(1234, 156069898, "David Falana", 07)));
	
		System.out.println("Name");
		Scanner in1111 = new Scanner(System.in);
		String name = in1111.nextLine();
		
		System.out.println("Account #");
		Scanner in1 = new Scanner(System.in);
		int num1 = in1.nextInt();
		
		System.out.println("Pin #");
		Scanner in2 = new Scanner(System.in);
		int num2 = in2.nextInt();
		
		
		if ( num1 == 100000001 && num2 == 1234)
			{
			System.out.println("Welcome " + name);
			System.out.println(" (1) View Balance\n (2) Deposit\n (3) Withdraw\n (4) Exit\n ");
		}
		Scanner in3 = new Scanner(System.in);
		int num3 = in3.nextInt();
		if (num3 == 1)
		{
			System.out.println(balance);
		}
		else if (num3 == 2)
		{
			System.out.println("How Much Do You Want To Deposit?");
			Scanner in4 = new Scanner(System.in);
			int num4 = in4.nextInt();
			System.out.println("Your New Balance Is: " + (balance + num4));
			
		}
		else if (num3 == 3)
		{
			if (balance == 0)
			{
				System.out.println("You Have No Money To Withdraw");
			}
			else if (balance > 0)
			{
				System.out.println("You Have: " + balance);
			}
			
		}
		
		else if (num3 == 4)
		{
			System.out.print("Goodbye");
		}
	

	}
	
	
}