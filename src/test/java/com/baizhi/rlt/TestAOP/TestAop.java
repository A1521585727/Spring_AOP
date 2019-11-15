package com.baizhi.rlt.TestAOP;

import com.baizhi.rlt.entity.User;
import com.baizhi.rlt.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void TestAOP(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserService userService= (UserService)ctx.getBean("userService");
        userService.insert(new User());
    }
}
