package com.mba.pizzaria.model.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author Ivan Pagoto
 */

@Entity
@Table(name="cardapio_ingredientes")
public class CardapioIngredientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Cardapio é obrigatório")
	@ManyToMany
	@JoinColumn(name = "cardapio_id", foreignKey = @ForeignKey(name = "CARDAPIO_ID_FK"))
	private Cardapio cardapio;
	
	@NotEmpty(message="Ingrediente é obrigatório")
	@ManyToMany
	@JoinColumn(name = "Ingrediente_id", foreignKey = @ForeignKey(name = "INGREDIENTE_ID_FK"))
	private Ingrediente ingrediente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

}
