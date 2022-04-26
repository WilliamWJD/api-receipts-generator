package com.apireceipt.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "recibos")
public class Recibo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer numeroRecibo;
	private Double valor;
	private String descricao;
	private String cep;
	private Integer enderecoNum;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	public Recibo() {
	}

	public Recibo(Integer id, Integer numeroRecibo, Double valor, String descricao, String cep, Integer enderecoNum, Cliente cliente) {
		super();
		this.id = id;
		this.numeroRecibo = numeroRecibo;
		this.valor = valor;
		this.descricao = descricao;
		this.cep = cep;
		this.enderecoNum = enderecoNum;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroRecibo() {
		return numeroRecibo;
	}

	public void setNumeroRecibo(Integer numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getEnderecoNum() {
		return enderecoNum;
	}

	public void setEnderecoNum(Integer enderecoNum) {
		this.enderecoNum = enderecoNum;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recibo other = (Recibo) obj;
		return Objects.equals(id, other.id);
	}
}
