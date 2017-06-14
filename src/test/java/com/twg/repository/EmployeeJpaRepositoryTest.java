package com.twg.repository;

import com.twg.entity.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by twg on 2017/6/14.
 */
public class EmployeeJpaRepositoryTest {
    private ApplicationContext ctx = null;
    private EmployeeJpaRepository employeeJpaRepository = null;

    @Before
    public void setup(){
        ctx = new ClassPathXmlApplicationContext("spring/beans-new.xml");
        employeeJpaRepository = ctx.getBean(EmployeeJpaRepository.class);
        System.out.println("setup");
    }

    @After
    public void tearDown(){
        ctx = null;
        System.out.println("teatDown");
    }

    @Test
    public void testFind(){
        Employee employee = employeeJpaRepository.findOne(99);
        System.out.println("employee:"+employee);
    }
}