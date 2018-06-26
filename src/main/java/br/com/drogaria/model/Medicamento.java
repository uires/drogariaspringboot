package br.com.drogaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "medicamentos")

public class Medicamento {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int quantidade;
	private double preco;
	private String substancias;
	private double pesoLiquido;

	public Medicamento() {
		
	}
	
	public Medicamento(String nome, int quantidade, double preco, String substancias, double pesoLiquido) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.substancias = substancias;
		this.pesoLiquido = pesoLiquido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getSubstancias() {
		return substancias;
	}

	public void setSubstancias(String substancias) {
		this.substancias = substancias;
	}

	public double getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(double pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

}
