/**
 * 
 */
package inheritance;

/**
 * @author Administrator
 *
 */
public class Insurance extends Customer {
	
	private int insurAmt;
	

	public Insurance(String name, int id, int accno, String accbranch, String acclocation, int insurAmt) {
		super(name, id, accno, accbranch, acclocation);
		this.insurAmt = insurAmt;
	}
	
	


	public int getInsurAmt() {
		return insurAmt;
	}




	



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	}

}
