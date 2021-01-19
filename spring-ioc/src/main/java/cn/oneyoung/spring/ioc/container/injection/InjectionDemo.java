package cn.oneyoung.spring.ioc.container.injection;

import cn.oneyoung.spring.common.entity.Employee;
import cn.oneyoung.spring.ioc.EmployeeInfo;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

/**
 * LookUpDemo
 *
 * @author oneyoung
 * @date 2021/1/14 23:09
 */
public class InjectionDemo {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("classpath:META-INF/dependency-injection.xml");
        EmployeeInfo bean = ((EmployeeInfo) beanFactory.getBean(EmployeeInfo.class));
        String[] beanNamesForType = beanFactory.getBeanNamesForType(EmployeeInfo.class);
        System.out.println(Arrays.toString(beanNamesForType));
        System.out.println("根据名称查找:" + bean);
        System.out.println(bean.getBeanFactory());
        System.out.println(bean.getBeanFactory() == beanFactory);
        // beanFactory 不是普通的bean
//        beanFactory.getBean(BeanFactory.class);
        ObjectFactory<Employee> objectFactory = bean.getEmployeeObjectFactory();
        System.out.println(objectFactory.getObject());
        ApplicationContext applicationContext = bean.getObjectFactory().getObject();
        System.out.println(applicationContext == beanFactory);
        System.out.println(beanFactory.getBean(Environment.class));
    }



}
