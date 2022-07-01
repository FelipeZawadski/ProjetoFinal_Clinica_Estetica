package com.example.projetofinal_clinica_estetica.service;


import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.model.ProcedimentoMaterial;
import com.example.projetofinal_clinica_estetica.repository.PacienteRepository;
import com.example.projetofinal_clinica_estetica.repository.ProcedimentoMaterialRepository;
import com.example.projetofinal_clinica_estetica.service.CRUD.CrudService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProcedimentoMaterialService extends CrudService<ProcedimentoMaterial, Integer> {

    private final ProcedimentoMaterialRepository procedimentoMaterialRepository;

    @Override
    public ProcedimentoMaterialRepository getRepository() {
        return procedimentoMaterialRepository;
    }

    public ProcedimentoMaterial salvar(ProcedimentoMaterial procedimentoMaterial){
        log.info("Salvar procedimento material {} {} {}", procedimentoMaterial.getProcedimento(), procedimentoMaterial.getMateriaisMedicos(), procedimentoMaterial.getQuantidade());
        var salvarProcedimentoMaterial = procedimentoMaterialRepository.saveAndFlush(procedimentoMaterial);

        return salvarProcedimentoMaterial;
    }
}
