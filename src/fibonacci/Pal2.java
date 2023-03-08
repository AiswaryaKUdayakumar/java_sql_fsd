/**
 * 
 */
package fibonacci;

/**
 * @author Administrator
 *
 */
import java.util.Scanner;
public class Pal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,rev=0,t=n;
		System.out.println("nter a number: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0) {
			int digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
		}
if (t==n)
	System.out.println("palindrome");
else
	System.out.println("not palindrome");
	}

}
