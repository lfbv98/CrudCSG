package com.luisbuitrago.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int salary;
	private int depto_id;

	public Employee() {
		
	}

	public Employee(int id, String name, int salary, int depto_id) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.depto_id = depto_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDepto_id() {
		return depto_id;
	}

	public void setDepto_id(int depto_id) {
		this.depto_id = depto_id;
	}
}
