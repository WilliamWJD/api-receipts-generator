package com.apireceipt.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apireceipt.domain.Cliente;
import com.apireceipt.domain.Recibo;
import com.apireceipt.dto.ReciboNewDTO;
import com.apireceipt.repositories.ClienteRepository;
import com.apireceipt.repositories.ReciboRepository;

@Service
public class ReciboService {
	
	@Autowired
	ReciboRepository reciboRepository;
	
	@Autowired
	ClienteService clienteService;
	
	@Transactional
	public Recibo insert(Recibo recibo) {
		recibo.setId(null);
		recibo = reciboRepository.save(recibo);
		return recibo;
	}
	
	public Recibo fromDTO(ReciboNewDTO obj) {
		Cliente cli = clienteService.find(obj.getClienteId());
		Recibo recibo = new Recibo(null, obj.getNumeroRecibo(), obj.getValor(), obj.getDescricao(), obj.getCep(), obj.getNumeroRecibo(), cli);
		return recibo;
	}
}
