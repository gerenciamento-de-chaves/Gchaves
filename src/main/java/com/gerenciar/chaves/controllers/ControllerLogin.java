package com.gerenciar.chaves.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerLogin {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "entrar";
	}
}

