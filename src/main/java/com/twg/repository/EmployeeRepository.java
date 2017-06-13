package com.twg.repository;

import com.twg.entity.Employee;
import org.springframework.data.repository.Repository;

/**
 * Created by twg on 2017/6/6.
 */
public interface EmployeeRepository extends Repository<Employee,Integer> {

    public Employee findByName(String name);
}
