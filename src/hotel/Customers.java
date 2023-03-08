/**
 * 
 */
package hotel;

/**
 * @author Administrator
 *
 */
public class Customers {
	private String regid;
	public String name;
	public String phnum;
	public String emailid;
	public String loc;
	public Customers(String regid, String name, String phnum, String emailid, String loc) {
		super();
		this.regid = regid;
		this.name = name;
		this.phnum = phnum;
		this.emailid = emailid;
		this.loc = loc;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	//@Override
	//public String toString() {
//		return "Customers [regid=" + regid + ", name=" + name + ", phnum=" + phnum + ", emailid=" + emailid + ", loc="
//				+ loc + "]";
//	}
	
	
	

}
