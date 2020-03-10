package com.hzj;
import com.hzj.services.StuServices;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
public class App {
    public static void main(String[] args) {
        //Beans工厂BeanFactory接口（DefaultListableBeanFactory）
        //Beans定义BeanDefinition
        //Beans在哪里配置（在xml文件中定义了）( XmlBeanDefinitionReader)
        DefaultListableBeanFactory  defaultListableBeanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader=new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");
        StuServices stuServicesImp = defaultListableBeanFactory.getBean("stuServicesImp", StuServices.class);
        stuServicesImp.fun();


    }
}
