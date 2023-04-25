package ustbatchno3.Practice;

import java.util.Scanner;

public class Revstring {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.next();
		String r=" ";
		
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		 }
		System.out.println(r);
		}
	}
