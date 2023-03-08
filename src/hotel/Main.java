
package hotel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import employeelist.Emp;
public class Main {

	
	public static void main(String[] args) {
		Customers c1 = new Customers("100","Aish","9876543210","aish100@gmail.com","Malappuram");
		Customers c2 = new Customers("101","Amee","8765432109","amee101@gmail.com","Ernamkulam");
		Customers c3 = new Customers("102","Aysh","7654321089","aysh102@gmail.com","Ernamkulam");
		Customers c4 = new Customers("104","Hari","6543210789","hari103@gmail.com","Ernamkulam");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Reg Id: ");
		String s=sc.next();
		
		
		//List<Customers> list= Arrays.asList(c1,c2,c3,c4);
		//Customers lis = list.stream().filter(t->s.equals(t.getRegid())).findAny().orElse(null);
		
		//System.out.println(lis);
		
		//Akhil's method
		List<Customers> list= Arrays.asList(c1,c2,c3,c4);
		List<Customers> lis = list.stream().filter(t->t.getRegid().equals(s)).collect(Collectors.toList());
		
			if(lis.isEmpty()) {
			System.out.println("No records found");
			}
			
			else {
				for(Customers det : lis) {
					System.out.println("ID : "+det.getRegid()+ "\nname: "+det.getName()+ "\nPhnum : "+det.getPhnum()+" \nemailid "+det.getEmailid()+ "\nloc : "+det.getLoc());
				}
			
		
		}
		
				
				
	
		
	
		

	}

}
