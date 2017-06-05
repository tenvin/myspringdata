package com.twg.dao;

import com.twg.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by twg on 2017/6/5.
 */
public class StudentDAOJdbcTemplateImpl implements StudentDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> query() {
        final List<Student> students = new ArrayList<Student>();
        String sql = "SELECT id,name,age FROM student";

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            public void processRow(ResultSet resultSet) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setAge(age);

                students.add(student);
            }
        });
        return students;
    }

    public void save(Student student) {
        //TODO
        String sql = "insert into student(name,age) VALUES (?,?)";
        jdbcTemplate.update(sql,new Object(){});
    }
}
