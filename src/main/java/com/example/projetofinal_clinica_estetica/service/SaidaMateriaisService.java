package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.ControleEstoque;
import com.example.projetofinal_clinica_estetica.model.ProcedimentoMaterial;
import com.example.projetofinal_clinica_estetica.model.dto.ItemQuantidade;
import com.example.projetofinal_clinica_estetica.model.enums.TipoEntrada;
import com.example.projetofinal_clinica_estetica.repository.ControleEstoqueRepository;
import com.example.projetofinal_clinica_estetica.service.CRUD.EstoqueService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static com.example.projetofinal_clinica_estetica.model.enums.TipoEntrada.SAIDA;

@Slf4j
@Service
public record SaidaMateriaisService (ControleEstoqueRepository controleEstoqueRepository, EstoqueService estoqueService){

    public void removerMateriaisEstoque(List<ProcedimentoMaterial> materiais){
        List<ItemQuantidade> procedimento = materiais
                .stream()
                .map(procedimentoMaterial -> new ItemQuantidade(procedimentoMaterial.getMateriaisMedicos(), procedimentoMaterial.getQuantidade()))
                .toList();
        salvarControleEstoque(procedimento);
        atualizarEstoque(procedimento);
    }

    private void salvarControleEstoque(List<ItemQuantidade> materiais){
        materiais.stream()
                .map(material -> ControleEstoque.builder()
                        .materiaisMedicos(material.getMateriaisMedicos())
                        .dataHorario(LocalDateTime.now())
                        .tipoEntrada(SAIDA)
                        .quantidade(material.getQuantidade())
                        .build())
                .forEach(controleEstoqueRepository::save);
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
