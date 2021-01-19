package cn.oneyoung.spring.ioc;

import cn.oneyoung.spring.common.entity.Employee;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

/**
 * EmployeeInfo
 *
 * @author oneyoung
 * @date 2021/1/16 21:02
 */
@Getter
@Setter
@ToString
public class EmployeeInfo {

    private Collection<Employee> collection;

    private BeanFactory beanFactory;

    private ObjectFactory<Employee> employeeObjectFactory;

    private ObjectFactory<ApplicationContext> objectFactory;


}
