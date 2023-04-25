package ustbatchno3.Practice;

import java.util.Scanner;

public class Lowupviceversa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.next();
		String n=" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLowerCase(c)) {
				n += Character.toUpperCase(c);
				
			}
			else if(Character.isUpperCase(c)) {
				n += Character.toLowerCase(c);
			}
			else {
				n+=c;
			}
		}
		System.out.println((n));
		

	}

}
