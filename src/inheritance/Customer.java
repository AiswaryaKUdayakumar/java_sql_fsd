/**
 * 
 */
package inheritance;

/**
 * @author Administrator
 *
 */
public class Customer {
	private String name;
	private int id;
	private int accno;
	private String accbranch;
	private String acclocation;
	public Customer(String name, int id, int accno, String accbranch, String acclocation) {
		this.name = name;
		this.id = id;
		this.accno = accno;
		this.accbranch = accbranch;
		this.acclocation = acclocation;
	}
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAccno() {
		return accno;
	}
	
	public String getAccbranch() {
		return accbranch;
	}
	
	public String getAcclocation() {
		return acclocation;
	}
	
	
 

}
