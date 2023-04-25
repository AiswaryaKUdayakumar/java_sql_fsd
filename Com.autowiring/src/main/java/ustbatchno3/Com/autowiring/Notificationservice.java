/**
 * 
 */
package ustbatchno3.Com.autowiring;

/**
 * @author Administrator
 *
 */
public class Notificationservice {
	private Messageservices messageservices;
	public void Notifyme() {
		System.out.println("Hey,I am autowired");
		
	}
	public void setMessageservices(Messageservices messageservices) {
		this.messageservices = messageservices;
	}
}
