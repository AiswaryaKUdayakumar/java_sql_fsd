/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public class Savingsaccount extends Account {
	private double minbalance;

	public Savingsaccount(int accountnum, Customer customerobj, double balance, double minbalance) {
		super(accountnum, customerobj, balance);
		this.minbalance = minbalance;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (balance-amount
				>minbalance)
			
		{
			balance = balance-amount;
			System.out.println("balance is "+balance);
		return true;
		
	}
		else
		{
			return false;
		}
		}

}
