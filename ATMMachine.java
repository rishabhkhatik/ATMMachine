package ATMMachine;

import java.util.Scanner;

class ATM
{
	float Balance;
	int PIN=9955;
	public void checkpin()
	{
		System.out.println("Welcome To State Bank Of India ATM");
		System.out.println("Enter your pin: ");
		Scanner s=new Scanner(System.in);
		int enteredpin=s.nextInt();
		if(enteredpin==PIN)
		{
			menu();
		}
		else
		{
			System.out.println("Enter a valid pin!..");
		}
	}
	
	public void menu()
	{
		System.out.println("Enter your choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");
		
		Scanner s=new Scanner(System.in);
		int opt=s.nextInt();
		
		if(opt==1)
		{
			checkBalance();
		}
		else if(opt==2)
		{
			withdrawMoney();
		}
		else if(opt==3)
		{
			depositMoney();
		}

		else if(opt==4)
		{
			System.out.println("Collect your ATM Card\nThank you for using ATM Machine");
		}
		else
		{
			System.out.println("Please enter a correct choice");
		}
	}
	
	public void checkBalance()
	{
		System.out.println("Balance: "+Balance);
		menu();
	}
	public void withdrawMoney()
	{
		System.out.println("Enter Amount to Withdraw:");
		Scanner s=new Scanner(System.in);
		float amount=s.nextInt();
		if(amount>Balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			Balance=Balance-amount;
			System.out.println("Money Withdrawl Successful");
		}
		menu();
	}
	
	public void depositMoney()
	{
		System.out.println("Enter the Amount: ");
		Scanner s=new Scanner(System.in);
		float amount=s.nextInt();
		Balance=Balance+amount;
		System.out.println("Money Deposited Successfully");
		menu();
	}
	
}
public class ATMMachine 
{

	public static void main(String[] args)
	{
		ATM obj=new ATM();
		obj.checkpin();
	}

}
