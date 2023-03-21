package com.venky;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
      EmployeeDao ab=(EmployeeDao)ctx.getBean("id2");
     // ab.create();
        EmployeeBean eb=new EmployeeBean();
        eb.setEmpid(1);
        eb.setEmpName("venky");
        eb.setSalary(50000);
       // ab.insert(eb);
        eb.setEmpid(1);
        eb.setEmpName("rama");
        eb.setSalary(60000);
        //ab.update(eb);
        ab.delete(eb);
        
        
        
       
    }
}
