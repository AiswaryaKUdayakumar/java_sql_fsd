/**
 * 
 */
package ustbatchno3.Com.autowiring;

/**
 * @author Administrator
 *
 */
public class Smsservices implements Messageservices {
	public void sendmessages(String message) {
		System.out.println("I am from SMS services ");

}
}
