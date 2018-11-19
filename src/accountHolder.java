import java.util.Scanner;
public class accountHolder 
{
	private int pin;
	private int ssn;
	private String name;
	private int phoneNumber;
	
	public accountHolder (int pin, int ssn, String name, int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.ssn = ssn;
	}

	public int getpin()
	{
		return pin;
	}
	
	public int getSSN () {
		return ssn;
	}
	
	public String getname()
	{
		return name;
	}

	public int getphoneNumber()
	{
		return phoneNumber;
		
	}

	public void setPin (int pin)
	{
		this.pin = pin;
	}
	
	public void setSSN(int ssn)
	{
		this.ssn = ssn;
	}
	
	public void setphoneNumber (int phoneNumber)
	{
		 this.phoneNumber = phoneNumber;
	}

	public void setName (String name)
	{
		 this.name = name;
	}

}
