package com.apireceipt.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apireceipt.domain.Recibo;
import com.apireceipt.services.ReciboService;

@RestController
@RequestMapping(value = "/recibos")
public class ReciboResource {

	@Autowired
	ReciboService reciboSevice;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Recibo recibo){
		reciboSevice.insert(recibo);
		return ResponseEntity.noContent().build();
	}
}
