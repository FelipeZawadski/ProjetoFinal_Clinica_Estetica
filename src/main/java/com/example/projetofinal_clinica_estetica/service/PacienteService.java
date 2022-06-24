package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.repository.AgendamentoRepository;
import com.example.projetofinal_clinica_estetica.repository.PacienteRepository;
import com.example.projetofinal_clinica_estetica.service.CRUD.CrudService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class PacienteService extends CrudService<Paciente, UUID> {

    private final PacienteRepository pacienteRepository;


    @Override
    public PacienteRepository getRepository() {
        return pacienteRepository;
    }


    public Paciente salvar(Paciente paciente){
        log.info("Salvar paciente {} {} {} {}", paciente.getData_nascimento(), paciente.getCpf(), paciente.getNome(), paciente.getTelefone());
        var salvarPaciente = pacienteRepository.saveAndFlush(paciente);

        return salvarPaciente;
    }
}
