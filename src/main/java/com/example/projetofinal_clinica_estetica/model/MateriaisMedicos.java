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
public class MateriaisMedicos extends Model{

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String nomeProduto;

    private Integer qtd;
}
