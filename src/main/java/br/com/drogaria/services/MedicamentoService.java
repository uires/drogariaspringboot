package br.com.drogaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.drogaria.repository.MedicamentoRepository;

@Service
public class MedicamentoService {
	@Autowired
	public MedicamentoRepository repository;
	
	
}
