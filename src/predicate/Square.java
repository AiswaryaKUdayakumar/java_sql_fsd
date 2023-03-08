/**
 * 
 */
package predicate;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */
import java.util.List;
import java.util.stream.Collectors;
public class Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s =Arrays.asList(1,2,3,4,5);
		List<Integer> squarelist=s.stream().filter(t->t%2==0).map(t->t=t*t).collect(Collectors.toList());
		
		System.out.println(squarelist);
				

	}

}
