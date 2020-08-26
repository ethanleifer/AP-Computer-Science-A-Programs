

// BankAccount.java

/*
Bank Account
1. Balance - double
2. Owners name - string
3. Number of transactions - int
4. interest rate - double
*/

public class BankAccount 
{
	// instance fields
	private double balance;
	private String ownerName;
	private String password;
	private int numTranscations;
	private int accountNumber;
	
	private static int nextAccountNumber = 1;
	public static double interestRate = 0.05;
	
	public BankAccount()
	{
		this("",0.0, "");
	}
	
	public BankAccount(String name, double initialDeposit)
	{
		this(name, initialDeposit, "");
	}
	
	public BankAccount(String name, double intialDeposit, String pw)
	{
		balance = intialDeposit;
		password = pw;
		ownerName = name;
		numTranscations = 0;
		
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	
	public void withdraw(String pw, double amount)
	{
		if (pw.equals(password))
		{
			balance -= amount;
			numTranscations++;
		}
	}
	// precondition:  amount > 0
	// postcondition: balance has increased by amount
	public void deposit(String pw, double amount)
	{
		if (pw.equals(password))
		{
			balance += amount;
			numTranscations++;
		}
	}
	
	public void changePassword(String oldpw, String newpw)
	{
		if (oldpw.equals(password))
			password = newpw;	
	}
	
	public double getBalanace()
	{return balance;}
	
	public double getName()
	{return ownerName;}
	
	public  String toString()
	{return ownerName + " has a balance of " + balance + " and a rate of " + interestRate + " : account number is " + accountNumber;}
}