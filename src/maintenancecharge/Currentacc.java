/**
 * 
 */
package maintenancecharge;

/**
 * @author Administrator
 *
 */
public class Currentacc extends Account implements Maintenance {

	public Currentacc(String accountnumber, String customername, double balance) {
		super(accountnumber, customername, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculatemaintenancecharge(float noofyears) {
		// TODO Auto-generated method stub
		int m=50;
		float calculatemaintenancecharge = (noofyears*m)+50;
		return calculatemaintenancecharge;
	}


}
