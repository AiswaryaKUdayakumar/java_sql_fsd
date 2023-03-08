package pinnumber;

import java.util.Scanner;
public class luckynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[4];
        System.out.println("Enter a four digit number");
        
        a=s.nextInt();
        
       
        for (int i=0;i<4;i++)
        {
        	if((a[i]==3||a[i]==6||a[i]==9)&(a[i]==6||a[i]==9||a[i]==3)&(a[i]==9||a[i]==3||a[i]==6)) {
        		System.out.println("lucky number: ");
        	}
        	else
        		System.out.println("not lucky number: ");
        }
        

		
		

	}

}
