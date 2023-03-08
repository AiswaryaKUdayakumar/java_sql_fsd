package employeelist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Emp e1 = new Emp(101,"Aiswarya",20000);
		Emp e2 = new Emp(102,"Ameena",2000);
		Emp e3 = new Emp(103,"Aysha",70000);
		Emp e4 = new Emp(104,"Haritha",40000);
		
		List<Emp> list= Arrays.asList(e1,e2,e3);
		List<Emp> lis = list.stream().sorted(Comparator.comparing(Emp::getSalary).reversed())
				.peek(k->{
					if((k.getSalary()>=50000)&&(k.getSalary()<100000))
						k.setSalary(k.getSalary()+(0.1)*k.getSalary());
					else if(k.getSalary()>=100000)
						k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
				).toList();
		
		System.out.println(lis);
					
					}

	}

