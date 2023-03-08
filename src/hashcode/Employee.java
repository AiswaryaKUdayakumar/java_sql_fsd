/**
 * 
 */
package hashcode;

import java.util.Objects;

/**
 * @author Administrator
 *
 */
public class Employee {
	
	private int Id;
	private String name;
	private String department;
	private int age;
	@Override
	public int hashCode() {
		return Objects.hash(Id, age, department, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Id == other.Id && age == other.age && Objects.equals(department, other.department)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int id, String name, String department, int age) {
	
		this .Id = id;
		this.name = name;
		this.department = department;
		this.age = age;
	}

	

}
