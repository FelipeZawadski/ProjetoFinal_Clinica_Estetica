package com.example.projetofinal_clinica_estetica.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcedimentoMaterial extends Model{

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @Getter
    private Procedimento procedimento;

    @ManyToOne @Getter
    private MateriaisMedicos materiaisMedicos;

    @Getter
    private Double quantidade;

}
