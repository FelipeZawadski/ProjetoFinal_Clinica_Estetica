package com.example.projetofinal_clinica_estetica.model;


import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Estoque {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @Getter
    private MateriaisMedicos materiaisMedicos;

    private Double quantidade;

    private LocalDateTime ultimaTransacao;
}
