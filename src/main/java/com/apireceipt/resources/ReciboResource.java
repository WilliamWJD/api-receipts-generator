package com.apireceipt.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apireceipt.domain.Recibo;
import com.apireceipt.dto.ReciboNewDTO;
import com.apireceipt.services.ReciboService;

@RestController
@RequestMapping(value = "/recibos")
public class ReciboResource {

	@Autowired
	ReciboService reciboSevice;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody ReciboNewDTO recibo){
		Recibo obj = reciboSevice.fromDTO(recibo);
		obj = reciboSevice.insert(obj);
		return ResponseEntity.noContent().build();
	}
}
