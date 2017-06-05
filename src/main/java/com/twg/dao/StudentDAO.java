package com.twg.dao;

import com.twg.entity.Student;

import java.util.List;

/**
 * Created by twg on 2017/6/5.
 */
public interface StudentDAO {
    public List<Student> query();

    public void save(Student student);
}
