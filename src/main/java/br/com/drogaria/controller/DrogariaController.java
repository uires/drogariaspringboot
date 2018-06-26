package br.com.drogaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.drogaria.model.Medicamento;
import br.com.drogaria.repository.MedicamentoRepository;

@Controller
public class DrogariaController {
	@Autowired
	private MedicamentoRepository repository;
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}

	@RequestMapping("gerenciamento-medicamento")
	public String gereciamentoPage(Model modelo) {
		Iterable<Medicamento> medicamentos = repository.findAll();
		modelo.addAttribute("medicamentos", medicamentos);
		return "gerenciamento-medicamento";
	}
	
	@RequestMapping(value = "cadastrar", method = RequestMethod.POST)
	public String cadastraMedicamento(@RequestParam("nome") String nome, @RequestParam("quantidade") int quantidade,
			@RequestParam("preco") double preco, @RequestParam("substancia") String substancias,
			@RequestParam("pesoliquido") double pesoliquido, Model modelo) {
		repository.save(new Medicamento(nome, quantidade, preco, substancias, pesoliquido));
		modelo.addAttribute("medicamentos", repository.findAll());
		
		return "gerenciamento-medicamento";
	}
	
}
