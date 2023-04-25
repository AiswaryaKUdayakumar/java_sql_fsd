/**
 * 
 */
package ustbatchno3.junit5testcases;

/**
 * @author Administrator
 *
 */
public class Vowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Aiswarya";
		String s1=s.toLowerCase();
		int count=0;
		int i;
		for(i=0;i<s.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				{
		count=count+1;
            

		
		}	


			}
	return count;

		}
	public static void main(String[] args) {
		System.out.println(Vowel("Aiswarya"));
	}
}


