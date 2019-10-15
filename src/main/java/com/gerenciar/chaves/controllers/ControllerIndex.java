package com.gerenciar.chaves.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gerenciar.chaves.model.Aluno;
import com.gerenciar.chaves.repository.CrudRepository;

@Controller
public class ControllerIndex {
	
	@Autowired
	CrudRepository crudRepository;
	
	
	
	@GetMapping("/")
	public String cadastro() {
		return "cadastro";
	}
	
	@PostMapping("/")
	public String salvar(Aluno aluno) {
		crudRepository.save(aluno);
		return "redirect:/lista";
	}

}
