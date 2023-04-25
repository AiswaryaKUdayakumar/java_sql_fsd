

package ustbatchno3.junit5testcases;

public class Repeat {

	public static void main(String[] args) {
		String arr[]=new String[]{"Aiswarya","Ameena","Aiswarya","Aysha","Haritha"};
		int count=0;
		System.out.println("Duplicate characters: ");
		for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				
				System.out.println(arr[j]);
			}
			count=count+1;

		}
		}
	}
}
		
	
		
	


