package com.mba.pizzaria.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author Ivan Pagoto
 */

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Data do pedido é obrigatório!")
	private Date dataPedido;
	
	private Date previsaoEntrega;
	
	private Date dataEntrega;
	
	private String observacoesPedido;
	
	@NotEmpty(message="Nome da Rua para entrega é obrigatório!")
	private String entrega_rua;
	
	@NotEmpty(message="Numero para entrega é obrigatório!")
	private String entrega_numero;
	
	@NotEmpty(message="Para a entrega pelo menos uma referencia é obrigatório!")
	private String entrega_referencia;
	
	private double valorTotalPedido;
	
	@NotEmpty(message="Cliente é obrigatório")
	@ManyToOne
	@JoinColumn(name = "cliente_id", foreignKey = @ForeignKey(name = "CLIENTE_ID_FK"))
	private Cliente cliente;
	
	@NotEmpty(message="Usuario é obrigatório")
	@ManyToOne
	@JoinColumn(name = "usuario_id", foreignKey = @ForeignKey(name = "USUARIO_ID_FK"))
	private Usuario usuario;
	
	@NotEmpty(message="Pessoa é obrigatório")
	@ManyToOne
	@JoinColumn(name = "pessoa_id", foreignKey = @ForeignKey(name = "PESSOA_ID_FK"))	
	private Pessoa funcionarioEntrega;
	
	@NotEmpty(message="Forma de Pagamento é obrigatório")
	@ManyToOne
	@JoinColumn(name = "forma_pagamento_id", foreignKey = @ForeignKey(name = "FORMA_PAGAMENTO_ID_FK"))	
	private FormaPagamento formaPagamento;
	
	@NotEmpty(message="Bairro de Entrega é obrigatório")
	@ManyToOne
	@JoinColumn(name = "bairro_id", foreignKey = @ForeignKey(name = "BAIRRO_ID_FK"))
	private Bairro bairro;
	
	@NotEmpty(message="Estatus do Pedido obrigatório")
	@ManyToOne
	@JoinColumn(name = "pedido_status_id", foreignKey = @ForeignKey(name = "PEDIDO_STATUS_ID_FK"))
	private PedidoStatus pedidoStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(Date previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getObservacoesPedido() {
		return observacoesPedido;
	}

	public void setObservacoesPedido(String observacoesPedido) {
		this.observacoesPedido = observacoesPedido;
	}

	public String getEntrega_rua() {
		return entrega_rua;
	}

	public void setEntrega_rua(String entrega_rua) {
		this.entrega_rua = entrega_rua;
	}

	public String getEntrega_numero() {
		return entrega_numero;
	}

	public void setEntrega_numero(String entrega_numero) {
		this.entrega_numero = entrega_numero;
	}

	public String getEntrega_referencia() {
		return entrega_referencia;
	}

	public void setEntrega_referencia(String entrega_referencia) {
		this.entrega_referencia = entrega_referencia;
	}

	public double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotalPedido(double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Pessoa getFuncionarioEntrega() {
		return funcionarioEntrega;
	}

	public void setFuncionarioEntrega(Pessoa funcionarioEntrega) {
		this.funcionarioEntrega = funcionarioEntrega;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public PedidoStatus getPedidoStatus() {
		return pedidoStatus;
	}

	public void setPedidoStatus(PedidoStatus pedidoStatus) {
		this.pedidoStatus = pedidoStatus;
	}	
	
}
