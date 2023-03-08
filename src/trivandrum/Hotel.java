
package trivandrum;


public class Hotel {
	private String regid;
	public String adhar;
	public String name;
	public String emailid;
	public String loc;
	public Hotel(String regid, String adhar, String name, String emailid, String loc) {
		super();
		this.regid = regid;
		this.adhar = adhar;
		this.name = name;
		this.emailid = emailid;
		this.loc = loc;
	
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
}