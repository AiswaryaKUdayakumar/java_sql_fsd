/**
 * 
 */
package arraylist;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */

import java.util.*;
public class New {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<String> list=new ArrayList<String>();
				list.add("blue");
				list.add("black");
				list.add("white");
				list.add("red");
				Iterator itr=list.iterator();
				while(itr.hasNext()){
					System.out.println(itr.next());
				}

			}

		}


	


