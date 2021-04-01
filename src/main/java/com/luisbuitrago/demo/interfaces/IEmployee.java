package com.luisbuitrago.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luisbuitrago.demo.modelo.Employee;
@Repository
public interface IEmployee extends CrudRepository<Employee, Integer>{

}
