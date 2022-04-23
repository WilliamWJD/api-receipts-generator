package com.apireceipt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apireceipt.domain.Cliente;
import com.apireceipt.repositories.ClienteRepository;
import com.apireceipt.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente insert(Cliente obj) {
		return clienteRepository.save(obj);
	}
	
	public List<Cliente> findAll(){
		List<Cliente> clientes = clienteRepository.findAll();
		return clientes;
	}
	
	public Cliente find(Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado, Id: " + id +", Tipo: " + Cliente.class.getName()));
	}
}
