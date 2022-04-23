package com.apireceipt.dto;

import java.io.Serializable;

import com.apireceipt.domain.Recibo;

public class ReciboDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer numeroRecibo;
	private Double valor;
	private String descricao;
	private String cep;
	private Integer enderecoNum;
	
	public ReciboDTO() {
	}

	public ReciboDTO(Recibo obj) {
		this.id = obj.getId();
		this.numeroRecibo = obj.getNumeroRecibo();
		this.valor = obj.getValor();
		this.descricao = obj.getDescricao();
		this.cep = obj.getCep();
		this.enderecoNum = obj.getEnderecoNum();
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
}
