package com.jovixe.boot.lab.repository;



import com.jovixe.boot.lab.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public  interface I_EmployeeRepository extends JpaRepository<Employee, Long> {

}