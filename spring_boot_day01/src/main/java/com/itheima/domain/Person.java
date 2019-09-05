package com.itheima.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author heiye
 * @date 2019-08-08 10:27
 *
 * @ConfigurationProperties :加载yml中的属性配置
 * @Component： 将该组件加载到springBOot容器中
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;
    private int age;

    private Map maps;
    private List<String> list;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map getMaps() {
        return maps;
    }

    public void setMaps(Map maps) {
        this.maps = maps;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
