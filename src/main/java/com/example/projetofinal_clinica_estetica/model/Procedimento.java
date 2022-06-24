package com.example.projetofinal_clinica_estetica.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


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

    @ManyToOne
    private Medico medico;

    private LocalDateTime data;

    public Procedimento(Medico medico, MateriaisMedicos materiaisMedicos){
        this.medico = medico;
        this.materiaisMedicos = materiaisMedicos;
        this.data =LocalDateTime.now();
    }

}
