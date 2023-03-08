/**
 * 
 */
package maintenancecharge;

/**
 * @author Administrator
 *
 */
public class Savingsacc extends Account {

	public Savingsacc(String accountnumber, String customername, double balance) {
		super(accountnumber, customername, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void calculatemaintenancecharge(float noofyears) {
		// TODO Auto-generated method stub
		int m=200;
		float calculatemaintenancecharge = (noofyears*m)+200;
		return calculatemaintenancecharge;
	}
}
