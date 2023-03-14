/** Write a JAVA program to find the given lucky number 
from the list.
 * 
 */
package arrays;

import java.util.Scanner;
/**
 * @author Administrator
 *
 */
import java.util.Scanner;
public class Cumulativesum {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int flag1=0;
		int flag2=0;
		int flag3=0;
		int digit=0;
	
	 while(n>0)
	 {
		digit=n%10; 
		if (digit==3)
	    	flag1=1;
	    else if(digit==6)
	    	flag2=1;
	    else if(digit==9)
	    	flag3=1;
	
	 n=n/10;
	 }
		
	 if(flag1==1&&flag2==1&&flag3==1)
	 {
		 System.out.println("lucky number: ");
	 
	 }
	 else
	 {
		 System.out.println("not lucky number: ");
	 }
		
		}

}
