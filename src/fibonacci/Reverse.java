/**
 * 
 */
package fibonacci;

/**
 * @author Administrator
 *
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=01233210,rev=0;
		while(n!=0)
		{
		int digit=n%10;
		rev=rev*10+digit;
		n=n/10;
		}
		if (n==rev)
		System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		}
	   
		// TODO Auto-generated method stub

	}

}
