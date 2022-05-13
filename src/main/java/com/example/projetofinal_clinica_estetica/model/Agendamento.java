package com.example.projetofinal_clinica_estetica.model;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import lombok.*;

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
public class Agendamento {

    @Id
    @GeneratedValue(strategy = AUTO)
    private UUID id;

    @NotNull
    private LocalDate data_consulta;

    @OneToOne @Getter
    private Paciente paciente;

    @OneToOne @Getter
    private Procedimento procedimento;
}
