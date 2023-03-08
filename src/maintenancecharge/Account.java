/**
 * 
 */
package maintenancecharge;

/**
 * @author Administrator
 *
 */
public class Account {
	String accountnumber;
	String customername;
	double balance;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(String accountnumber, String customername, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.customername = customername;
		this.balance = balance;
	}

}
