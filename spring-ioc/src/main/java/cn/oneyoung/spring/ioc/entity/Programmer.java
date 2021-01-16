package cn.oneyoung.spring.ioc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Programmer
 *
 * @author oneyoung
 * @date 2021/1/14 23:04
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Programmer extends Employee{

    private List<String> languages;

    private List<String> skills;
}
