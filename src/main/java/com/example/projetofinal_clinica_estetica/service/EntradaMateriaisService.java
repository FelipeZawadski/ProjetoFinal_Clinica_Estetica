package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.RegistroEstoque;
import com.example.projetofinal_clinica_estetica.model.dto.ItemQuantidade;
import com.example.projetofinal_clinica_estetica.service.CRUD.EstoqueService;
import com.example.projetofinal_clinica_estetica.service.CRUD.RegistroEstoqueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.example.projetofinal_clinica_estetica.model.enums.TipoEntrada.ENTRADA;

@Service
@Slf4j
public record EntradaMateriaisService(RegistroEstoqueService registroEstoqueService, EstoqueService estoqueService) {


    public List<ItemQuantidade> listaMateriais() {
        return new ArrayList<>();
    }

    public void entradaListaMateriais(List<ItemQuantidade> materiais) {
        log.info("Iniciando entrada de materiais ...");
        registroMovimentacaoEstoque(materiais);
        atualizarEstoque(materiais);
        log.info("Lista finalizada");
    }

    private void registroMovimentacaoEstoque(List<ItemQuantidade> materiais) {
        log.info("Iniciando movimentacao do estoque ...");
        materiais.stream()
                .map(material -> RegistroEstoque.builder()
                        .materiaisMedicos(material.getMateriaisMedicos())
                        .tipo(ENTRADA)
                        .qtd(material.getQuantidade())
                        .dataHorario(LocalDateTime.now())
                        .build())
                .forEach(registroEstoqueService::save);
        log.info("Movimentacao do estoque finalizada");
    }

    private void atualizarEstoque(List<ItemQuantidade> materiais){
        log.info("Atualizando estoque...");
        materiais.stream()
                .map(material -> estoqueService.findFirstByMateriaisMedicos(material.getMateriaisMedicos())
                        .atualizar(material))
                .forEach(estoqueService::save);
        log.info("Estoque atualizado");
    }
}
