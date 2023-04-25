package ustbatchno3.testNG;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import hotel.Customers;





public class CompanyMain {

	public static void main(String[] args) {
		
		Company c1=new Company("Trivandrum",1600,900);
		Company c2=new Company("Chennai",1800,1000);
		Company c3=new Company("Hydrebad",2000,900);
		Company c4=new Company("Mumbai",2500,1200);
		Company c5=new Company("Cochin",1800,1200);
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the City: ");
		String s=sc.next();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Squarefeet: ");
		String s1=sc1.next();
		
		List<Company> list=Arrays.asList(c1,c2,c3,c4,c5);
		List<Company> lis=list.stream().filter(t->t.getCity().equals(s)).collect(Collectors.toList());
		
		
		for(Company det : lis) {
			System.out.println("City "+det.getPricewithmaterial()+ "\nname: "+det.getPricewithoutmaterial());
		}
	
		
		
}
}
