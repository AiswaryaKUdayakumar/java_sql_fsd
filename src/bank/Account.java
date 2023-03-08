/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public abstract class Account {
	protected int accountnum;
	protected Customer customerobj;
	protected double balance;
	public Account(int accountnum, Customer customerobj, double balance) {
		this.accountnum = accountnum;
		this.customerobj = customerobj;
		this.balance = balance;
		
	}
	public abstract boolean withdraw(double amount);
	

}
