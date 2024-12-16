package com.samuelsoares.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuelsoares.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
