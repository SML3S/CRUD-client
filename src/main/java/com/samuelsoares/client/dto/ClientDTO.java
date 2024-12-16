package com.samuelsoares.client.dto;

import java.time.LocalDate;

import com.samuelsoares.client.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {

	private Long id;
	
	@NotBlank(message = "Campo requerido")
	private String name;	
	private String cpf;
	
	@PastOrPresent
	private LocalDate birthDate;
	private Integer children;

	public ClientDTO() {

	}

	public ClientDTO(Long id, String name, String cpf, LocalDate birthDate, Integer children) {

		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.children = children;
	}

	public ClientDTO(Client entity) {

		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
	
	
}
