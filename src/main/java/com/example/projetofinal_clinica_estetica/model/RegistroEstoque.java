package com.example.projetofinal_clinica_estetica.model;

import com.example.projetofinal_clinica_estetica.model.enums.TipoEntrada;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistroEstoque {

    @Id
    @GeneratedValue
    @Type(type = "uuid-char")
    private UUID id;

    @OneToOne
    @Getter
    private MateriaisMedicos materiaisMedicos;

    private TipoEntrada tipo;
    private Double qtd;
    private LocalDateTime dataHorario;
}
