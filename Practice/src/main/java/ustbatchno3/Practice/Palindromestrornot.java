
package ustbatchno3.Practice;

public class Palindromestrornot {

	public static void main(String[] args) {
		String s="Malayalam";
		s=s.toLowerCase();
		
		int n=s.length();
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				flag=false;
			break;
			}
		}
		if(flag) {
			System.out.println("Palindrome");
		}
	}

}
