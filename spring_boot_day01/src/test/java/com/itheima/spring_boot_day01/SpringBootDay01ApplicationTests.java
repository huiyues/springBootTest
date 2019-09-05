package com.itheima.spring_boot_day01;

import com.itheima.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDay01ApplicationTests {

    @Autowired
    private Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }
}
