package com.samuelsoares.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuelsoares.client.dto.ClientDTO;
import com.samuelsoares.client.services.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@GetMapping(value = "/{id}")
	public ClientDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<ClientDTO> findAll() {
		return service.findAll();
		 
	}
	
	@PostMapping
	public ClientDTO insert(@RequestBody  ClientDTO dto) {
		
		return service.insert(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ClientDTO update(@PathVariable Long id, @RequestBody ClientDTO dto) {
		
		return service.update(id, dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
