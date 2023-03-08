/**
 * 
 */
package hashcode;

/**
 * @author Administrator
 *
 */
import java.util.HashMap;

public class Codehash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer,Employee> map=new HashMap<>();
				map.put(1,new Employee(245182,"Aiswarya","Developer",24));
				map.put(2,new Employee(245255,"Ameena","Developer",22));
				map.put(3,new Employee(245254,"Aysha","Developer",22));
				map.put(4,new Employee(245205,"Haritha","Developer",22));
				
							
				Employee age = map.get(1);
				System.out.println("Age of Ameena : " + age);
				
				System.out.println(map.get(1));
				System.out.println(map.get(2));
				System.out.println(map.get(3));
				System.out.println(map.get(4));
				
		
	}

}
