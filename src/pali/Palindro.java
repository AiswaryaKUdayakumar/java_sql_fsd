/**
 * 
 */
package pali;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Palindro {
public static void main(String[] args) {
		 		// TODO Auto-generated method stub
		 		
		 		
		 		System.out.println("Enter a number   : ");
		 		Scanner s=new Scanner(System.in);
		 		int n=s.nextInt();
		 		int r=0,sum=0,temp=0;
		 		temp=n;
		 		
		 		while(n>0)
		 	    {
		 	    	r=n%10;
		 	    	sum=(sum*10)+r;
		 	    	n=n/10;
		 	    }
		 		if (temp==sum) {
		 			System.out.println("palidrome: ");
		 		}
		 	    else {
		 			System.out.println("Not Palindrome: ");
		 	    }
		 			
		 			
		 	}
		 

	}


