package com.example.projetofinal_clinica_estetica.model;

import com.example.projetofinal_clinica_estetica.model.enums.ProcedimentoTipo;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Procedimento {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private ProcedimentoTipo procedimentoTipo;

    @NotNull
    @ManyToOne
    private MateriaisMedicos materiaisMedicos;
}
