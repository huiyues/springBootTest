package com.itheima.spring_boot_day01;

import com.itheima.SpringBootDay01Application;
import com.itheima.dao.UserRepository;
import com.itheima.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author heiye
 * @date 2019-08-08 18:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDay01Application.class)
public class UserRedisTest {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test(){
        List<User> user = (List<User>) redisTemplate.boundValueOps("UserCache").get();
        if (user == null){
            List<User> userList = repository.findAll();
            redisTemplate.boundValueOps("UserCache").set(userList);
            System.out.println("从数据库中获取数据....");
        }else {
            System.out.println("从缓存中获取数据....");
        }

        System.out.println(user);
    }
}
