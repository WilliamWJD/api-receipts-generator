package com.apireceipt.domain.enums;

public enum EstadoCivil {
	SOLTEIRO(1, "Divorciado (a)"),
	CASADO(2, "Divorciado (a)"),
	DIVORCIADO(3, "Divorciado (a)"),
	VIUVO(4, "Viuvo (a)");
	
	private int cod;
	private String descricao;
	
	private EstadoCivil(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoCivil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(EstadoCivil x : EstadoCivil.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
