package com.devsuperior.CRUD_de_Clientes.dto;

import com.devsuperior.CRUD_de_Clientes.entities.Client;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;

  @Size(min = 3,max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
  @NotBlank(message = "Campo requerido")
  private String name;

    @NotBlank(message = "Campo requerido")
    @CPF
    private String cpf;
    @Positive(message = "Rendimento deve ser positivo")
    private Double income;
    @PastOrPresent(message = "data inválida")
    private LocalDate birthDate;

   @Min(0)
   private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
       id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income =entity.getIncome();
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

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}


