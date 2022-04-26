package com.apireceipt.dto;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.apireceipt.domain.Recibo;


public class ReciboNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer numeroRecibo;
	
	private Double valor;
	
	private String descricao;
	
	private String cep;
	
	private Integer enderecoNum;
	
	private Integer clienteId;
	
	public ReciboNewDTO() {
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

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	
}
