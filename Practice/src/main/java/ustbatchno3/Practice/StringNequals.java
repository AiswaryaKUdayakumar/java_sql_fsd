package ustbatchno3.Practice;

import java.util.Scanner;

public class StringNequals {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.next();
		int n=3;
		int len=s.length();
		int temp=0;
		int N=len/n;
		String[] equalstr=new String[n];
			if(len%n!=0) {
				System.out.println("String can't be divided into N parts");
			}
				else {
					for(int i=0;i<s.length();i=i+N) {
						String part=s.substring(i,i+N);
						equalstr[temp]=part;
						temp=temp+1;
						}
					System.out.println(n);
					for(int i=0;i<equalstr.length;i++) {
						System.out.println(equalstr[i]);
					}
			}
			
				

	}

}

