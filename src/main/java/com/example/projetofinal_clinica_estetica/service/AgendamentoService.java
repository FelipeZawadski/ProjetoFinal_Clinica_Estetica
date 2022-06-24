package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import com.example.projetofinal_clinica_estetica.model.Estoque;
import com.example.projetofinal_clinica_estetica.model.MateriaisMedicos;
import com.example.projetofinal_clinica_estetica.repository.AgendamentoRepository;
import com.example.projetofinal_clinica_estetica.repository.EstoqueRepository;
import com.example.projetofinal_clinica_estetica.repository.MateriaisMedicosRepository;
import com.example.projetofinal_clinica_estetica.service.CRUD.CrudService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AgendamentoService extends CrudService<Agendamento, Long> {

    private final AgendamentoRepository agendamentoRepository;


    @Override
    public AgendamentoRepository getRepository() {
        return agendamentoRepository;
    }


    public Agendamento salvar(Agendamento agendamento){
        log.info("Salvar agendamento {} {} {} {}", agendamento.getProcedimento(),agendamento.getData_consulta(),agendamento.getPaciente(), agendamento.getMedico());
        var salvarAgendamento = agendamentoRepository.saveAndFlush(agendamento);

        return salvarAgendamento;
    }

}
