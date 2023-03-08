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
import java.util.ArrayList;
public class Productprice1 {
	int id;
	String name;
	float price;
	public Productprice1(String name,int id, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Productprice1> p=new ArrayList<Productprice1>();
		p.add(new Productprice1("Samsung",100,15000));
		p.add(new Productprice1("Redmi",101,8000));
		p.add(new Productprice1("Poco",102,10000));
		p.add(new Productprice1("Iphone",103,30000));
		List<Float> p1=p.stream().filter(p2->p2.price>10000).map(p2->p2.price).collect(Collectors.toList());
				System.out.println(p1);
		
	 
		

	}

}


