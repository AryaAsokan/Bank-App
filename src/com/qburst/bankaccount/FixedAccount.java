/**
 * 
 */
package com.qburst.bankaccount;

/**
 * @author user
 *
 */
public class FixedAccount extends Account {

	/**
	 * 
	 */
	public FixedAccount(int number)
	{

		super(number,0.08,0.0);
	}

	public void deposit() {
		System.out.println("Sorry!!!Can't deposit!!!!");
	}
	public void withdraw() {
		System.out.println("Sorry!!!Can't withdraw!!!!");
	}
	public void initialDeposit(double amount)
	{
		balance=balance+amount;
		getBalance();
	}
}
