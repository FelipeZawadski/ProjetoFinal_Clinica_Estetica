package com.example.projetofinal_clinica_estetica.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Paciente {

    @Id
    @GeneratedValue(strategy = AUTO)
    private UUID id;

    @NotNull
    private String nome;

    @Column(unique = true)
    private String cpf;

    @NotNull
    private String telefone;

    @NotNull
    private LocalDate data_nascimento;

}
