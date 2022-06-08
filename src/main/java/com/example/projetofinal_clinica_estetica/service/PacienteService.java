package com.example.projetofinal_clinica_estetica.service;

import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.repository.PacienteRepository;
import org.springframework.stereotype.Service;

@Service
public record PacienteService (PacienteRepository repository){

    public void salvar(Paciente paciente){
        repository.save(paciente);
    }
}
