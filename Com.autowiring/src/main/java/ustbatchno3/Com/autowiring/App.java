package ustbatchno3.Com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("application.xml"); 
    	Notificationservice n = context.getBean("New",Notificationservice.class);
    	n.Notifyme();
    	Emailservice e = context.getBean("New1",Emailservice.class);
    	e.sendmessages("Hi");
    	Smsservices s = context.getBean("New2",Smsservices.class);
    	s.sendmessages("Hi");
    	 }
}
