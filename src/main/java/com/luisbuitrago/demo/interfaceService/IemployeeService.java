package com.luisbuitrago.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.luisbuitrago.demo.modelo.Employee;

public interface IemployeeService {
	public List<Employee>listar();
	public Optional<Employee>listarId(int id);
	public int save(Employee e);
	public void delete(int id);

}
