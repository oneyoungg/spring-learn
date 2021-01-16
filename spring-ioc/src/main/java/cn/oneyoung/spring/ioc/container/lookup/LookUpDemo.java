package cn.oneyoung.spring.ioc.container.lookup;

import cn.oneyoung.spring.ioc.entity.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * LookUpDemo
 *
 * @author oneyoung
 * @date 2021/1/14 23:09
 */
public class LookUpDemo {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:META-INF/dependency-lookup.xml");
        lookupByBeanName(beanFactory, "programmer");
        lookupByClass(beanFactory, Employee.class);
        lookUpListAble(beanFactory, Employee.class);
    }

    public static void lookUpListAble(BeanFactory beanFactory, Class<?> clazz) {
        ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
        Map<String, ?> beansOfType = listableBeanFactory.getBeansOfType(clazz);
        System.out.println("listAble:     ");
        beansOfType.forEach((s, o) -> System.out.println(s + " = " + o));
    }

    public static void lookupByBeanName(BeanFactory beanFactory, String beanName) {
        Object bean = beanFactory.getBean(beanName);
        System.out.println("根据名称查找:" + bean);
    }

    public static <T> void lookupByClass(BeanFactory beanFactory, Class<T> clazz) {
        T bean = beanFactory.getBean(clazz);
        System.out.println("根据class查找:" + bean);
    }
}
