/**
 * 
 */
package predicate;

/**
 * @author Administrator
 *
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;
public class Repeating {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<String> n1=Arrays.asList("apple","orange","apple","apple","grapes","apple","pineapple");
		List<String> n=n1.stream().filter(i->Collections.frequency(n1, i)>1).collect(Collectors.toList());
		long total=n.stream().count();
		System.out.println(total);
	}
}