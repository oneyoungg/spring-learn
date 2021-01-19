package cn.oneyoung.spring.bean.definitiin;

import cn.oneyoung.spring.common.entity.Programmer;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

/**
 * BeanDefinitionDemo
 *
 * @author oneyoung
 * @date 2021/1/17 17:27
 */
public class BeanDefinitionDemo {
    public static void main(String[] args) {
        // 通过beanDefinition build
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(Programmer.class);
        beanDefinitionBuilder
                .addPropertyValue("name","oneyoung")
                .setScope(BeanDefinition.SCOPE_SINGLETON)
                .setLazyInit(true);
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        System.out.println(beanDefinition);

        // 直接构建

    }
}
