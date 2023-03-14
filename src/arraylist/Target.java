/** Write JAVA program to find and print the 
numbers whose sum gives 25.
 * 
 */
package arraylist;

/**
 * @author Administrator
 *
 */
import java.util.*;
public class Target {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(5);
		list.add(20);
		list.add(13);
		Iterator itr=list.iterator();
		for(int i=0;i<4;i++)
			for(int j=1+1;j<4;j++)
			{
				if(list.get(i)+list.get(j)==25)
				{
					System.out.println(list.get(i));
					System.out.println(list.get(j));
			}
		
		

	}

}

}
