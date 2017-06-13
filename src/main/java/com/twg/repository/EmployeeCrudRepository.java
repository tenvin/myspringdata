package com.twg.repository;

import com.twg.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by twg on 2017/6/13.
 */
public interface EmployeeCrudRepository extends CrudRepository<Employee,Integer>{
}
