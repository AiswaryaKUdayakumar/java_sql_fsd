/**
 * 
 */
package count;

/**
 * @author Administrator
 *
 */
public class Negpos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int array[]= {4,-4,6,8,-9,0,4,-7,56};
	int poscount=0;
	int negcount=0;
	
	for(int i=0;i<array.length;i++){
		if (array[i]>0) {
			poscount=poscount+1;
		}
	else if  (array[i]<0) {
		negcount=negcount+1;
	}
	else {
		System.out.println("zero is neutral");	
	}
	}
	System.out.println("The number of positive numbers:"+ poscount);
	System.out.println("The number of negative numbers:"+ negcount);

	
		// TODO Auto-generated method stub

	}

}
