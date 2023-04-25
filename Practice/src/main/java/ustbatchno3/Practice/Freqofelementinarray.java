/**
 * 
 */
package ustbatchno3.Practice;

public class Freqofelementinarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,4,3,5,3,6,3,4,7};
		int fr[]=new int[arr.length];
		int visited=-1;
		int count=0;
		
		
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
			}
				if(fr[i]!=visited) {
					fr[i]=count;	
					
			}
				
		}
		
		}

		for(int i=0;i<fr.length;i++) {
		if(fr[i]!=visited)
		System.out.println(fr[i]);

}
}
}
