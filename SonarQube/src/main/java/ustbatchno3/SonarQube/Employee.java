/* 
 * Write a code to create empname,empage,noofyears working and salary.Now,the increment is of an 
 * salary based on experience.If 1 to 2 years of experience,salary is 2.5% and 3 to 6 years of experience, 
 * 5%. 6 to 10 years of experience,10%.The person who have above 10 yrs of exp,12%. 
 */
package ustbatchno3.SonarQube;

/**
 * @author Administrator
 *
 */
public class Employee {
	public int age;
	public String name;
	public int exp;
	public double salary;
	public Employee(int age, String name, int exp, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.exp = exp;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", exp=" + exp + ", salary=" + salary + "]";
	}
	
	
	}
	
  
  
  