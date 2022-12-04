import java.util.*;
import java.io.*;
public class ATMInterface {
	public static void displayBalance(int balance)
	{
		System.out.println("Current Balance : " + balance);
		System.out.println();
	}
    //Amount after withdrawing
	public static int amountWithdrawing(int balance,
										int withdrawAmount)
	{
		System.out.println("Withdrawn Operation:");
		System.out.println("Withdrawing Amount : " + withdrawAmount);
		if (balance >= withdrawAmount) 
        {
			balance = balance - withdrawAmount;
			System.out.println("Amount to be collected");
			displayBalance(balance);
		}
		else {
			System.out.println("Sorry! Insufficient Funds");
			System.out.println();
		}
		return balance;
	}

	// Deposit amount and update the balance
	public static int amountDepositing(int balance,
									int depositAmount)
	{
		System.out.println("Deposit Operation:");
		System.out.println("Depositing Amount : " + depositAmount);
		balance = balance + depositAmount;
		System.out.println("Your Money has been successfully deposited");
		displayBalance(balance);
		return balance;
	}

	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Balance amount:");
		int balance = sc.nextInt();
        System.out.println("Enter Withdraw amount:");
		int withdrawAmount = sc.nextInt();
        System.out.println("Enter Deposit amount:");
		int depositAmount = sc.nextInt();
		displayBalance(balance);
		balance = amountWithdrawing(balance, withdrawAmount);
		balance = amountDepositing(balance, depositAmount);
	}
}
