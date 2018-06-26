package br.com.drogaria.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.drogaria.model.Medicamento;

public interface MedicamentoRepository extends CrudRepository<Medicamento, Long>{

}
