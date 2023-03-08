/**
 * 
 */
package predicate;

/**
 * @author Administrator
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Filtercity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("Trivandrum","Mumbai","Trichi","Bangloor","Trissur","Jaipur");
		List<String> Tcities=s.stream().filter(t->t.startsWith("T")).collect(Collectors.toList());
		System.out.println(Tcities);

	}

}