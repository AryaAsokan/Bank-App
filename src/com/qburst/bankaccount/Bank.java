/**
 * 
 */
package com.qburst.bankaccount;
import java.util.Scanner;

/**
 * @author user
 *
 */
public class Bank 
{
	static void displayMenu()
	{
		System.out.println("\n\tChoose Account Type:\n1.Savings Account\n2.Current Account\n3.Fixed Account\n4.Exit.");
	}
	public static void main(String[] args) 
	{
		int option,AccNo;
		Account newAccount=null;
		Scanner in=new Scanner(System.in);
		displayMenu();
		option=in.nextInt();
		do
		{
			System.out.println("\nEnter Account Number:");
			AccNo=in.nextInt();	
			switch(option)
			{
			case 1:newAccount=new SavingsAccount(AccNo);
			System.out.println("Account No:SA"+newAccount.accNo);
			newAccount.initialDeposit();
			newAccount.transaction();
			break;
			case 2:newAccount=new CurrentAccount(AccNo);
			System.out.println("Account No:CA"+newAccount.accNo);
			newAccount.initialDeposit();
			newAccount.transaction();
			break;
			case 3:newAccount=new FixedAccount(AccNo);					
			System.out.println("Account No:FA"+newAccount.accNo);
			newAccount.initialDeposit();
			newAccount.transaction();
			break;
			case 4:System.exit(1);
			break;
			default:System.out.println("Invalid Entry!!!");
			}
			displayMenu();
			option=in.nextInt();
		}while(option!=4);
	}

}
