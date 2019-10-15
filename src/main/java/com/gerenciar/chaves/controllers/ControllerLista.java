package com.gerenciar.chaves.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gerenciar.chaves.model.Aluno;
import com.gerenciar.chaves.repository.CrudRepository;

@Controller
public class ControllerLista {
	@Autowired
	CrudRepository crudRepository;
	
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public String lista(Model model) {
		model.addAttribute("aluno", crudRepository.findAll());
		return "lista";
	}
	
	@RequestMapping("lista/delete/{id}")
    public String delete(@PathVariable Long id) {
        crudRepository.deleteById(id);
        return "redirect:/lista";
    }
	
	@RequestMapping("/findOne")
	@ResponseBody
	public Optional<Aluno> findOne(Long id){
		return crudRepository.findById(id);
	}
	//@RequestMapping("product/delete/{id}")
}
