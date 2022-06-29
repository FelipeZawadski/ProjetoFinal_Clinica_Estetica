package com.example.projetofinal_clinica_estetica.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.*;

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
public class Agendamento extends Model{

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private LocalDate data_consulta;

    @OneToOne @Getter
    private Paciente paciente;

    @ManyToOne @Getter
    private Procedimento procedimento;

    //@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true) @Getter
    @ManyToOne
    private Medico medico;

}
