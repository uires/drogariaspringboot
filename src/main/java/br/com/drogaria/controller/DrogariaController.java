package br.com.drogaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DrogariaController{
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/gerenciamento-medicamento")
	public String gerenciamento() {
		return "gerenciamento-medicamento";
	}
}
