package ustbatchno3.Practice;

public class Removewhitespace {

	public static void main(String[] args) {
		String sc="Hai Hello I Am Aiswarya";
		String s=sc.toLowerCase();
//		int len=s.length();
//		
//		for(int i=0;i<len;i++) {
//			char ch=s.charAt(i);
//			if(s.charAt(i)!=" ") {
//				System.out.println();
//		}
//	
		s=s.replaceAll(" ", "");
		System.out.println(s);
		
	}

}

