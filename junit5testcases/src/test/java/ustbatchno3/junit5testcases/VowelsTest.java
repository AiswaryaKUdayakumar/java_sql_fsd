package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

//import count.CountVowelstest;
import org.junit.Test;
/**
 * @author Administrator
 *
 */
public class VowelsTest {
	
	@Test
	public void counttesting() {
		
		String input ="Hai";
		
		int expected=2;
		int actual=Vowels.vowelscount(input);
		assertEquals(expected,actual);
		
	}	
}
		
		
		
	
