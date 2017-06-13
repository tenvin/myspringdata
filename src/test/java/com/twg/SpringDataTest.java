package com.twg;

import com.twg.entity.Employee;
import com.twg.repository.EmployeeRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by twg on 2017/6/5.
 */
public class SpringDataTest {
    private ApplicationContext ctx = null;
    private EmployeeRepository employeeRepository = null;

    @Before
    public void setup(){
        ctx = new ClassPathXmlApplicationContext("spring/beans-new.xml");
        employeeRepository = ctx.getBean(EmployeeRepository.class);
        System.out.println("setup");
    }

    @After
    public void tearDown(){
        ctx = null;
        System.out.println("teatDown");
    }

    @Test
    public void EntityManagerTest(){

    }
    @Test
    public void testFindByName(){
        Employee employee = employeeRepository.findByName("tian");
        System.out.println("id:"+employee.getId()+
                ",name:"+employee.getName()+", age:"+employee.getAge());
    }
}
