package com.itheima.spring_boot_day01;

import com.itheima.SpringBootDay01Application;
import com.itheima.dao.UserRepository;
import com.itheima.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author heiye
 * @date 2019-08-08 18:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDay01Application.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void testFindAll() {
        List<User> all = repository.findAll();
        System.out.println(all);
    }
}
