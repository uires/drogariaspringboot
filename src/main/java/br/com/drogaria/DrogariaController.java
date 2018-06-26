package br.com.drogaria;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DrogariaController {

	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}

	@RequestMapping("gerenciamento-medicamento")
	public String gereciamentoPage() {
		return "gerenciamento-medicamento";
	}
}
