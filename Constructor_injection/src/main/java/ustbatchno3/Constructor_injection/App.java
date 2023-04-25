package ustbatchno3.Constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("application.xml"); 
    	Roles r = context.getBean("New",Roles.class);
		r.display();
//		Roles s = context.getBean("New1",Roles.class);
//		s.display();
//		Roles t = context.getBean("New2",Roles.class);
//		t.display();
//		Roles u = context.getBean("New3",Roles.class);
//		u.display();
		
}
}