package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.model.Procedimento;
import com.example.projetofinal_clinica_estetica.repository.PacienteRepository;
import com.example.projetofinal_clinica_estetica.repository.ProcedimentoRepository;
import com.example.projetofinal_clinica_estetica.service.CRUD.CrudService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProcedimentoService extends CrudService<Procedimento, Long> {

    private final ProcedimentoRepository procedimentoRepository;


    @Override
    public ProcedimentoRepository getRepository() {
        return procedimentoRepository;
    }


    public Procedimento salvar(Procedimento procedimento){
        log.info("Salvar procedimento {} {} {} {}", procedimento.getMedico(), procedimento.getData(), procedimento.getMateriaisMedicos(), procedimento.getProcedimentoTipo());
        var salvarProcedimento = procedimentoRepository.saveAndFlush(procedimento);

        return salvarProcedimento;
    }
}
