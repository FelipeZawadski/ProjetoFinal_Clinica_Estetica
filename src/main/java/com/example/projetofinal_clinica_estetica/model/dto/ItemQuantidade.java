package com.example.projetofinal_clinica_estetica.model.dto;

import com.example.projetofinal_clinica_estetica.model.MateriaisMedicos;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ItemQuantidade {

    private MateriaisMedicos materiaisMedicos;

    private Double quantidade;
}
