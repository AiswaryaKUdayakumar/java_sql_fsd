/**
 * 
 */
package fibonacci;

/**
 * @author Administrator
 *
 */
public class Pal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=3443,rev=0,t=n;
			while(n!=0)
			{
			int digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
			}
			if(t==rev)
			System.out.println("palindrome");
			else
				System.out.println("not palindrome");
			}

	}

