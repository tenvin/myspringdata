package com.twg.repository;

import com.twg.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by twg on 2017/6/14.
 */
public interface EmployeeJpaRepository extends JpaRepository<Employee,Integer>{

}
