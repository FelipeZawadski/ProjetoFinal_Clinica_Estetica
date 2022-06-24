package com.example.projetofinal_clinica_estetica.model;

import com.example.projetofinal_clinica_estetica.model.enums.ProcedimentoTipo;
import com.example.projetofinal_clinica_estetica.model.enums.TipoEntrada;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class ControleEstoque extends Model{

    @Id
    @GeneratedValue
    @Type(type = "uuid-char")
    private UUID id;
    @OneToOne
    private MateriaisMedicos materiaisMedicos;
    private LocalDateTime dataHorario;
    private Double quantidade;
}
