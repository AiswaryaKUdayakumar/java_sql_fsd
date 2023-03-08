/**
 * 
 */
package inheritance;

/**
 * @author Administrator
 *
 */
public class Loan{
	Insurance c1 = new Insurance("Ammu",12,12345678,"Kazhakoottam","Trivandrum",25000);
	Insurance c2 = new Insurance("Chinnu",13,23456789,"Kulathoor","Trivandrum",30000);
	Insurance c3 = new Insurance("Sree",14,34567890,"Thambanoor","Trivandrum",40000);
	System.out.println(c1.getName());
	System.out.println(c1.getId());
	System.out.println(c1.getAccno());
	System.out.println(c1.getAccbranch());
	System.out.println(c1.getAcclocation());
	System.out.println(c1.getinsurAmt());
	System.out.println(c2.getName());
	System.out.println(c2.getId());
	System.out.println(c2.getAccno());
	System.out.println(c2.getAccbranch());
	System.out.println(c3.getAcclocation());
	System.out.println(c3.getName());
	System.out.println(c3.getId());
	System.out.println(c3.getAccno());
	System.out.println(c3.getAccbranch());
	System.out.println(c3.getAcclocation());
	
	
	

}
