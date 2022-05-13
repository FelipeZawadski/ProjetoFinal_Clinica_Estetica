package com.example.projetofinal_clinica_estetica.model;

import com.example.projetofinal_clinica_estetica.model.enums.ProcedimentoTipo;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    @GeneratedValue(strategy = AUTO)
    private UUID id;

    private ProcedimentoTipo procedimentoTipo;
}
