package com.hzj;
import com.hzj.services.StuServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        StuServices stuServicesImp = context.getBean("stuServicesImp", StuServices.class);
        stuServicesImp.fun();
    }
}
