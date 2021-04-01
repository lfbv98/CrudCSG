package com.luisbuitrago.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luisbuitrago.demo.interfaceService.IemployeeService;
import com.luisbuitrago.demo.modelo.Employee;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private IemployeeService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Employee>employees=service.listar();
		model.addAttribute("employees", employees);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("employee",new Employee());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Valid Employee e, Model model) {
		service.save(e);
		return "redirect:/listar";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id ,Model model) {
		Optional<Employee>employee=service.listarId(id);
		model.addAttribute("employee", employee);
		return "form";
	}
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
