package com.chandan.aws.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.chandan.aws.entity.Employee;

/**
 * @author Chandan Shrivastava
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer>  {
	
	List<Employee> findByName(@Param("name") String name);

}
