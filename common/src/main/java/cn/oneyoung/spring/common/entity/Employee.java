package cn.oneyoung.spring.common.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Employee
 *
 * @author oneyoung
 * @date 2021/1/14 23:03
 */
@Getter
@Setter
@ToString
public class Employee {

    private String name;

    private Integer age;

    private String address;

    private String department;
}
