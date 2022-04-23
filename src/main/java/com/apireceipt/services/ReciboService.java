package com.apireceipt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apireceipt.domain.Cliente;
import com.apireceipt.domain.Recibo;
import com.apireceipt.repositories.ReciboRepository;

@Service
public class ReciboService {
	
	@Autowired
	ReciboRepository reciboRepository;
	
	@Autowired
	ClienteService clienteService;
	
	public Recibo insert(Recibo recibo) {
		Cliente cliente = clienteService.find(recibo.getCliente_id());
		recibo.setCliente(cliente);
		return reciboRepository.save(recibo);
	}
}
