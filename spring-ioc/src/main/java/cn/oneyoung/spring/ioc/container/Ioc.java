package cn.oneyoung.spring.ioc.container;

import cn.oneyoung.spring.common.entity.Programmer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Ioc
 *
 * @author oneyoung
 * @date 2021/1/16 23:05
 */
@Configuration
public class Ioc {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Ioc.class);
        applicationContext.refresh();
        Programmer programmer = applicationContext.getBean(Programmer.class);
        System.out.println(programmer);

    }

    @Bean
    public Programmer programmer() {
        Programmer programmer = new Programmer();
        programmer.setName("oneyoung");
        return programmer;
    }
}
