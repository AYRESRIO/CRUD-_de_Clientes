package com.devsuperior.CRUD_de_Clientes.controllers;

import com.devsuperior.CRUD_de_Clientes.dto.ClientDTO;
import com.devsuperior.CRUD_de_Clientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
   private ClientService service;
@GetMapping(value ="/{id}")
    public ClientDTO findById(@PathVariable Long id){
    ClientDTO dto = service.findById(id);
    return dto;
    }
    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }
}
