package ustbatchno3.countname;

import java.util.List;


public class App 
{
    

	public static long countname(List<String> names, String targetname) {
		
		return names.stream().filter(n->n.equalsIgnoreCase(targetname)).count();
	}
}
