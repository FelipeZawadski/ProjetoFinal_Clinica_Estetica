package com.example.projetofinal_clinica_estetica.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Medico {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String nome;

    @NotNull
    private String cpf;

    @NotNull
    private String especializacao;

    @NotNull
    private String crm;
}
