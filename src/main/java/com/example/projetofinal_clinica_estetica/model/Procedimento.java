package com.example.projetofinal_clinica_estetica.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table
public class Procedimento extends Model{

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @Getter
    private MateriaisMedicos materiaisMedicos;

    //@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @ManyToOne
    private Medico medico;

    private LocalDateTime data;

    private String procedimentoTipo;

}
