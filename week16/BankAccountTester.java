// BankAccountTester.java


// Tests Bank Account class

public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount("Charlie", 100000);
		BankAccount a3 = new BankAccount("Helen", 250);
		
		System.out.println("Current interest rate: " + BankAccount.interestRate*100 + "%");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
	}
}