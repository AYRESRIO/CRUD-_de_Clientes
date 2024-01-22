package com.devsuperior.CRUD_de_Clientes.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg) {

        super(msg);
    }
}
