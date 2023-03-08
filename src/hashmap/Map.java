/**
 * 
 */
package hashmap;

import java.util.HashMap;

 
public class Map {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Aiswarya",24);
		map.put("Ameena",22);
		map.put("Aysha",22);
		map.put("Haritha",22);
		
		int age = map.get("Aiswarya");
		System.out.println("Age of Aiswarya : " + age);
		
		boolean aiswarya = map.containsKey("Ameena");
		System.out.println("HashMap contains Ameena :  " + aiswarya);
		
		boolean aysha = map.containsKey("Athira");
		System.out.println("HashMap contains Athira : " + aysha);
	
		for(String name:map.keySet()) {
			int value=map.get(name);
			System.out.println(name + " is " + value + " years ");
		}
		
		

	}

}
