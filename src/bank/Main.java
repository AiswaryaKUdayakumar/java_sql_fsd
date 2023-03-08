/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer c = new Customer(15, "Aiswarya", "aiswarya@gmail.com");
		Savingsaccount s = new Savingsaccount(1234567890, c, 10000, 500);
		System.out.println(c.getCustomerid());
		System.out.println(c.getCustomername());
		System.out.println(c.getEmailid());
		System.out.println(s.withdraw(800));
		

	}

}
