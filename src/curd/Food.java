/**
 * 
 */
package curd;

/**
 * @author Administrator
 *
 */
public class Food {
	//private String name;
	//private String uid;
	private String num;
	private String food;
	private String price;
	
	public Food( String num, String food, String price) {
		super();
		//this.name = name;
		//this.uid = uid;
		this.num = num;
		this.food = food;
		this.price = price;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getUid() {
//		return uid;
//	}
//	public void setUid(String uid) {
//		this.uid = uid;
//	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", uid=" + uid + ", num=" + num + ", food=" + food + ", price=" + price + "]";
	}
	
}