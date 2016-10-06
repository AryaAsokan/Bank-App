/**
 * 
 */

package com.qburst.bankaccount;
import java.util.Scanner;
/**
 * @author user
 *
 */
public class Account
{
	int accNo;
	double balance,amount,rate;	
	Scanner in;
	public Account(int accNo,double rate,double balance)
	{
		this.accNo=accNo;
		this.rate=rate;
		this.balance=balance;
	}
	public void getBalance()
	{
		System.out.println("Your current balance is Rs."+ balance);
	}
	public void initialDeposit()
	{	
		in=new Scanner(System.in);
		System.out.println("Enter Initial Amount:");
		amount=in.nextInt();
		balance=balance+amount;
		getBalance();
	} 
	public void updateAccount()
	{
		balance=balance+balance*rate;
		getBalance();
	} 
	void deposit()
	{
		in=new Scanner(System.in);
		System.out.println("Enter the amount:");
		amount=in.nextInt();
		balance=balance+amount;
		getBalance();
	}
	public void withdraw()
	{	
		in=new Scanner(System.in);
		System.out.println("Enter the amount:");
		amount=in.nextInt();
		if(this.balance-amount<1000)
		{
			System.out.println("Sorry,The minimum balance should be Rs.1000");
		}
		else
		{
			balance=balance-amount;
			getBalance();
		}

	}
	public void transaction()
	{
		int transaction;
		in=new Scanner(System.in);
		do
		{
			System.out.println("Choose Transaction:");

			System.out.println("1.Balance\n2.Deposit\n3.Withdrawal\n4.UpdateAccount\n5.Exit\n");
			transaction=in.nextInt();
			switch(transaction)
			{
			case 1: getBalance();
			break;
			case 2: deposit();
			break;
			case 3: withdraw();
			break;
			case 4: updateAccount();
			break;
			default:System.out.println("Your transaction is Completed Succesfully");

			} 
		}while(transaction!=5);
	}

}
