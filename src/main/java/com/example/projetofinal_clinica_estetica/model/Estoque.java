package com.example.projetofinal_clinica_estetica.model;


import com.example.projetofinal_clinica_estetica.model.dto.MateriaisQuantidade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Estoque extends Model {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @Getter
    private MateriaisMedicos materiaisMedicos;

    private Double quantidade;

    private LocalDateTime ultimaTransacao;

    public Estoque atualizar(MateriaisQuantidade materiaisQuantidade){
        this.quantidade += materiaisQuantidade.getQuantidade();
        return this;
    }
}
