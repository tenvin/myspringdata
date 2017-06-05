package com.twg.dao;

import com.twg.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by twg on 2017/6/5.
 */
public class StudentDAOTest {
    @Test
    public void saveDAO() throws Exception {
        Student student = new Student();
        student.setName("tian");
        student.setAge(40);

        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.save(student);
    }

    @Test
    public void queryDAO() throws Exception {
        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> students = studentDAO.query();

        for(Student student:students){
            System.out.println("id:"+student.getId()+",name:"+student.getName()
                                +",age:"+student.getAge());
        }
    }

    @Test
    public void queryJdbcTemplateTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/beans.xml");

        StudentDAO studentDAO = (StudentDAO) ctx.getBean("studentDAO");
        List<Student> students = studentDAO.query();

        for(Student student:students){
            System.out.println("id:"+student.getId()+",name:"+student.getName()
                    +",age:"+student.getAge());
        }

    }
}