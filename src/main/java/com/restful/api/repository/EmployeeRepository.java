package com.restful.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.restful.api.model.Employee;

//@Repository - Not Needed as it's automatically provide
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
