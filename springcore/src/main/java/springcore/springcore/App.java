package springcore.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
       
		/*
		 * We can fetch the values in two ways
		 */
    	
    	
		/* ## 1 Using ApplicationContext InterFace */
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("springcore/springcore/myConfig.xml");
       
         AppBean a = context.getBean("appBean",AppBean.class);
        
         System.out.println(a.toString());
         
			
         System.out.println("====================================");
         
         /* ## 2 Using BeanFactory Interface */
         
        
         
         
         Resource r = new ClassPathResource("springcore/springcore/myConfig.xml");
        
        BeanFactory factory = new XmlBeanFactory(r);
        AppBean b = factory.getBean("appBean",AppBean.class);
        
        System.out.println(b.toString());
    }
}
