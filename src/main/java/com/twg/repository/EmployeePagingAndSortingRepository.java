package com.twg.repository;

import com.twg.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by twg on 2017/6/14.
 */
public interface EmployeePagingAndSortingRepository extends PagingAndSortingRepository<Employee,Integer> {
}
