package com.mba.pizzaria.model.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


/**
 * @author Ivan Pagoto
 */

@Entity
@Table(name="itens_pedido")
public class ItensPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@NotEmpty(message="Pedido é obrigatório")
	@OneToMany
	@JoinColumn(name = "pedido_id", foreignKey = @ForeignKey(name = "PEDIDO_ID_FK"))
	private Pedido pedido;
	
	@NotEmpty(message="Cardapio é obrigatório")
	@OneToMany
	@JoinColumn(name = "cardapio_id", foreignKey = @ForeignKey(name = "CARDAPIO_ID_FK"))
	private Cardapio cardapio;
	
	@NotEmpty(message="Numero do Item do Pedido é obrigatório")
	private int item_pedido;
	
	@NotEmpty(message="Numero do Item do Pedido é obrigatório")
	private TamanhoPizzaEnum tamanhoPizza;
	
	@NotEmpty(message="Quantidade é obrigatório!")
	private int quantidade;
	
	private double subtotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public int getItem_pedido() {
		return item_pedido;
	}

	public void setItem_pedido(int item_pedido) {
		this.item_pedido = item_pedido;
	}

	public TamanhoPizzaEnum getTamanhoPizza() {
		return tamanhoPizza;
	}

	public void setTamanhoPizza(TamanhoPizzaEnum tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}	
	
}
