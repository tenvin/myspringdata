package com.twg.repository;

import com.twg.entity.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Created by twg on 2017/6/14.
 */
public class EmployeePagingAndSortingRepositoryTest {
    private ApplicationContext ctx = null;
    private EmployeePagingAndSortingRepository employeePagingAndSortingRepository = null;

    @Before
    public void setup(){
        ctx = new ClassPathXmlApplicationContext("spring/beans-new.xml");
        employeePagingAndSortingRepository = ctx.getBean(EmployeePagingAndSortingRepository.class);
        System.out.println("setup");
    }

    @After
    public void tearDown(){
        ctx = null;
        System.out.println("teatDown");
    }

    @Test
    public void testPage(){
        Pageable pageable = new PageRequest(0,5);
        Page<Employee> page = employeePagingAndSortingRepository.findAll(pageable);

        System.out.println("page:"+page.getTotalPages());
        System.out.println("page:"+page.getTotalElements());
        System.out.println("page:"+page.getContent());


    }

    @Test
    public void testPageAndSort(){
        Sort.Order order = new Sort.Order(Sort.Direction.DESC,"id");
        Sort sort = new Sort(order);
        Pageable pageable = new PageRequest(0,5,sort);
        Page<Employee> page = employeePagingAndSortingRepository.findAll(pageable);
        System.out.println("page:"+page.getTotalPages());
        System.out.println("page:"+page.getTotalElements());
        System.out.println("page:"+page.getContent());
    }

}