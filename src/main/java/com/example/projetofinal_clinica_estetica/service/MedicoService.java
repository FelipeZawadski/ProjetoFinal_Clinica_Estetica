package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import com.example.projetofinal_clinica_estetica.model.Medico;
import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.repository.MedicoRepository;
import com.example.projetofinal_clinica_estetica.repository.PacienteRepository;
import com.example.projetofinal_clinica_estetica.service.CRUD.CrudService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class MedicoService extends CrudService<Medico, Long> {

    private final MedicoRepository medicoRepository;


    @Override
    public MedicoRepository getRepository() {
        return medicoRepository;
    }


    public Medico salvar(Medico medico){
        log.info("Salvar medico {} {} {] {}", medico.getEspecializacao(),medico.getCpf(),medico.getCrm(),medico.getNome());
        var salvarMedico = medicoRepository.saveAndFlush(medico);

        return salvarMedico;
    }

    public void delete(Medico medico) {
        getRepository().delete(medico);
    }
}
