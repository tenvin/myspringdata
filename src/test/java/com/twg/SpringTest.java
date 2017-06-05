package com.twg;

import com.twg.dao.StudentDAO;
import com.twg.dao.StudentDAOJdbcTemplateImpl;
import com.twg.entity.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by twg on 2017/6/5.
 */
public class SpringTest {

    private ApplicationContext ctx = null;

    @Before
    public void setup(){
         ctx = new ClassPathXmlApplicationContext("spring/beans.xml");
        System.out.println("setup");
    }

    @After
    public void tearDown(){
        ctx = null;
        System.out.println("teatDown");
    }

    @Test
    public void DataSourceTest(){
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        Assert.assertNotNull(dataSource);
    }

    @Test
    public void jdbcTemplateTest(){

        StudentDAO studentDAO = new StudentDAOJdbcTemplateImpl();
        List<Student> students = studentDAO.query();

        for(Student student:students){
            System.out.println("id:"+student.getId()+",name:"+student.getName()
                    +",age:"+student.getAge());
        }
    }
}
