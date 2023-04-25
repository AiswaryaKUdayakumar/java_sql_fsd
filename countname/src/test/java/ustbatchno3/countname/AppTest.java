package ustbatchno3.countname;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	
	@Test
	public void countofnames(){
		
		List<String> names=Arrays.asList("sharath","kumar","sharath","sharath","sharath","sharath");
		String targetname="sharath";
		long expected=5;
		long actual=App.countname(names,targetname);
		assertEquals(expected,actual);
		
		
	}
}
   