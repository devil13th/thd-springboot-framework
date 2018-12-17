package com.thd.project.service;
/*
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thd.Application;
import com.thd.project.entity.Person;
//获取启动类，加载配置，确定装载 Spring 程序的装载方法，它会去寻找 主配置启动类(默认是@SpringBootApplication 注解的类)
//如果不配置@SpringBootTest的classes属性则自动寻找被 @SpringBootApplication 注解的）
@SpringBootTest(classes=Application.class)
//让 JUnit 运行 Spring 的测试环境， 获得 Spring 环境的上下文的支持
@RunWith(SpringRunner.class)
public class RedisServiceImplTest {
	@Before
    public void setUp() throws Exception {
        System.out.println(" ------------------------ junit @setUp() ---------------------- ");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println(" ------------------------ junit @After() ---------------------- ");
    }
    
    @Autowired
    private RedisService redisService;
    
    @Test
    public void testadd() {
        System.out.println(redisService);
        System.out.println(redisService.add(1));
        System.out.println(redisService.add(3));
        System.out.println(redisService.add(9));
        
    }
    
    
    @Test
    public void testaddPerson() {
        System.out.println(redisService);
        Person p = new Person();
        p.setName("new Person");
        p.setAge(5);
        p.setAddress("addr");
        this.redisService.add(p);
        System.out.println(p.getId());
    }
    
    @Test
    public void testupdatePerson() {
    	Person p = this.redisService.query("402881e5676c92a201676c92af100000");
    	p.setAddress(String.valueOf(Math.random()));
    	p.setAge(20);
    	p.setBirthday(new Date());
    	p.setName("devil13th");
    	redisService.update(p);
        System.out.println(p.getId());
    }
    
    @Test
    public void testqueryPerson() {
    	Person p = this.redisService.query("402881e5676f26d801676f26e28d0000");
        System.out.println(p.getId());
    }
    
    @Test
    public void testdeletePerson() {
    	Boolean r = this.redisService.delete("402881e5676c92a201676c92af100000");
        System.out.println(r);
    }
    
}*/
