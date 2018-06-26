package br.com.drogaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.drogaria.model.Medicamento;
import br.com.drogaria.repository.MedicamentoRepository;

/**
*	@author uires
*	date 2018/06/26
**/

@Service
public class MedicamentoService {
	@Autowired
	public MedicamentoRepository repository;
	
	/*
	*	@desc: faz um select no banco
	*	@param ()
	*	@return Collection de Medicamento 
	*/
	public Iterable<Medicamento> selectAllMedicamentos() {
		Iterable<Medicamento> medicamentos = repository.findAll();
		return medicamentos;
	}
	
	/*
	*	@desc: inserte o objeto no banco de dados
	*	@param <Object, Medicamento>
	*	@return void 
	*/
	public void cadastraMedicamento(Medicamento medicamento) {
		repository.save(medicamento);
	}
	
}
