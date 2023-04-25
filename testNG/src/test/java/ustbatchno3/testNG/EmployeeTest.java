package ustbatchno3.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest 
    
{
	@Test
    public void testofemployee() {
    	Employee e=new Employee("Aiswarya",24,"Developer");
    	Assert.assertEquals(e.getName(), "Aiswarya");
    	Assert.assertEquals(e.getAge(), 24);
    	Assert.assertEquals(e.getDepartment(),"Developer");
    	
    	
    	
    }
}
