package com.mba.pizzaria.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author Ivan Pagoto
 */

@Entity
@Table(name="cardapio")
public class Cardapio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Nome é obrigatório!")
	private String nome;
	
	@NotEmpty(message="Descrição é obrigatório!")
	private String descricao;

	@NotEmpty(message="Valor para a Pizza pequena é obrigatório!")
	private double valor_p;
	
	@NotEmpty(message="Valor para a Pizza média é obrigatório!")
	private double valor_m;
	
	@NotEmpty(message="Valor para a Pizza grande é obrigatório!")
	private double  valor_g;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor_p() {
		return valor_p;
	}

	public void setValor_p(double valor_p) {
		this.valor_p = valor_p;
	}

	public double getValor_m() {
		return valor_m;
	}

	public void setValor_m(double valor_m) {
		this.valor_m = valor_m;
	}

	public double getValor_g() {
		return valor_g;
	}

	public void setValor_g(double valor_g) {
		this.valor_g = valor_g;
	}
	
}
