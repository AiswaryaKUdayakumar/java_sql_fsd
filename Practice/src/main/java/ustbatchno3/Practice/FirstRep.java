package ustbatchno3.Practice;

import java.util.Scanner;

public class FirstRep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		
		char freq=0;
		int flag=0;
		for(int i=0;i<s.length();i++) {
			freq=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				System.out.println(freq+"=="+s.charAt(j));
			
				if(freq==s.charAt(j)) {
					flag=1;
					break;
					}
			}
		if(flag==1) {
			break;
		}
		System.out.println(freq);
		}
		}
		
	}

