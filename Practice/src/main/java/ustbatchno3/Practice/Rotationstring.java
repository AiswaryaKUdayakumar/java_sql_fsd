package ustbatchno3.Practice;

import java.util.Scanner;

public class Rotationstring {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
//		String s1="abcde";
//		String s2="deabc";
		String s3=s1.concat(s1);
		
		if(s3.contains(s2)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
		

	}

}
