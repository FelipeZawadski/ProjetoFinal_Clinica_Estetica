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
@Table(name = "realizar_procedimento")
public class Procedimento extends Model{

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @Getter
    private List<ProcedimentoMaterial> procedimentoMaterial;

    @ManyToOne
    private Medico medico;

    private LocalDateTime data;

    public Procedimento(Medico medico){
        this.medico = medico;
        this.procedimentoMaterial = new ArrayList<>();
        this.data =LocalDateTime.now();
    }

}
