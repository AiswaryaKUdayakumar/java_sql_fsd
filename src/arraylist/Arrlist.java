/** Write a JAVA program to remove 
index from the arraylist.
 * 
 */
package arraylist;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class Arrlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("grapes");
		list.add("pineapple");
		list.add("anar");
		
		list.remove(2);
		System.out.println(list);

	}

}

