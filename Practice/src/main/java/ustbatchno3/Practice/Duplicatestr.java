package ustbatchno3.Practice;

import java.util.Scanner;

public class Duplicatestr {

	public static void main(String[] args) {
//		String s="Hello World";
		Scanner sc=new Scanner(System.in);
		System.out.println("String: ");
		String s=sc.next();
		int count=0;
		
		char []c=s.toCharArray();
				for(int i=0;i<s.length();i++) {
					count=1;
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j] && c[j]!=' ') {
					count=count+1;
					c[j] = '0';    
                }    }
              
            if(count > 1 && c[i] != '0')    
                System.out.println(count);    
		
	

	}
	}
}
