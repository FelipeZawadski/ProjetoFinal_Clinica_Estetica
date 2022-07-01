package com.example.projetofinal_clinica_estetica;

import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.repository.PacienteRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class PacienteRepositoryTest {

    //java.lang.IllegalStateException: Failed to load ApplicationContext
    //Não compila somente apresenta esse erro, maioria das resposta que encontrei são pelo fator de ser uma dependencia
    //porem não obtive exito

    @Autowired
    private PacienteRepository pacienteRepository;

    @Test
    void verificarNome() {
        Paciente paciente = Paciente.builder()
                .nome("Felipe")
                .build();
        pacienteRepository.save(paciente);

        //Boolean result = pacienteRepository.existsByDescription("Felipe");

        //assertThat(result).isTrue();
    }

    @Test
    void verificarResultadoDiferenteNome() {
        Paciente paciente = Paciente.builder()
                .nome("Felipe")
                .build();
        pacienteRepository.save(paciente);

        //Boolean result = pacienteRepository.existsByDescription("João");

        //assertThat(result).isFalse();
    }
}
