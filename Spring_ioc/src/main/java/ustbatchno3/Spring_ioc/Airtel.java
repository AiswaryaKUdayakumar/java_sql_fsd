/**
 * 
 */
package ustbatchno3.Spring_ioc;

import ustbatchno3.Spring_ioc.Sim;

/**
 * @author Administrator
 *
 */
public class Airtel implements Sim  {
	public void Calling() {

	System.out.println("I am calling from the Airtel Sim");

	}
	public void Dialing() {
		System.out.println("I am dialing from Airtel Sim");
	}
}
