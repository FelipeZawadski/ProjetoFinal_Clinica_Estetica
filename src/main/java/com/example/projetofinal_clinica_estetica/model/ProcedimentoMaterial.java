package com.example.projetofinal_clinica_estetica.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcedimentoMaterial extends Model{

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @Getter
    private Procedimento procedimento;

    @ManyToOne @Getter
    private MateriaisMedicos materiaisMedicos;

    @Getter
    private Double quantidade;
}
