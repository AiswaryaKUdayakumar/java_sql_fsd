/**
 * 
 */
package linkedlist;

import java.util.LinkedList;

/**
 * @author Administrator
 *
 */
public class Link {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(5);
		l1.addLast(15);
		l1.addLast(20);
		l1.addLast(25);
		l1.addLast(30);
		System.out.println("LinkedList: "+ l1);
		int middle = l1.get(l1.size()/2);
		System.out.println("Middle Element: " +middle);
		
	}

}
