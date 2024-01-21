package com.devsuperior.CRUD_de_Clientes.repositories;

import com.devsuperior.CRUD_de_Clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
