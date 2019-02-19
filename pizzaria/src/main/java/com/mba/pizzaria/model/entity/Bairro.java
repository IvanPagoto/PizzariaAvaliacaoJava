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
@Table(name="bairro")
public class Bairro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@NotEmpty(message="Nome do Bairro é obrigatório!")
	private String nome;
	
	@NotEmpty(message="Tempo de entrega para este bairro é obrigatório!")
	private int tempo_entrega_min;

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

	public int getTempo_entrega_min() {
		return tempo_entrega_min;
	}

	public void setTempo_entrega_min(int tempo_entrega_min) {
		this.tempo_entrega_min = tempo_entrega_min;
	}
		
}
