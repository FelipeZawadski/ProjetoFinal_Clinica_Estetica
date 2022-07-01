package com.example.projetofinal_clinica_estetica;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.repository.AgendamentoRepository;
import com.example.projetofinal_clinica_estetica.repository.PacienteRepository;
import com.example.projetofinal_clinica_estetica.service.AgendamentoService;
import com.example.projetofinal_clinica_estetica.service.PacienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class PacienteServiceTest {

    private PacienteService pacienteService;

    @Mock
    private PacienteRepository pacienteRepository;


    @BeforeEach
    void setUp() {
        pacienteService = new PacienteService(pacienteRepository);
    }


    @Test
    void verificarPacienteData_Nascimento() {
        Paciente paciente = Paciente.builder().data_nascimento(LocalDate.now()).build();
        ArgumentCaptor<Paciente> itemArgumentCaptor = ArgumentCaptor.forClass(Paciente.class);

        pacienteService.save(paciente);

        verify(pacienteRepository).save(itemArgumentCaptor.capture());

        Paciente captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(paciente);
    }

    @Test
    void verificarPacienteCpf() {
        Paciente paciente = Paciente.builder().cpf("123.456.789.10").build();
        ArgumentCaptor<Paciente> itemArgumentCaptor = ArgumentCaptor.forClass(Paciente.class);

        pacienteService.save(paciente);

        verify(pacienteRepository).save(itemArgumentCaptor.capture());

        Paciente captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(paciente);
    }

    @Test
    void verificarPacienteNome() {
        Paciente paciente = Paciente.builder().nome("Felipe").build();
        ArgumentCaptor<Paciente> itemArgumentCaptor = ArgumentCaptor.forClass(Paciente.class);

        pacienteService.save(paciente);

        verify(pacienteRepository).save(itemArgumentCaptor.capture());

        Paciente captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(paciente);
    }

    @Test
    void verificarPacienteTelefone() {
        Paciente paciente = Paciente.builder().telefone("99096486").build();
        ArgumentCaptor<Paciente> itemArgumentCaptor = ArgumentCaptor.forClass(Paciente.class);

        pacienteService.save(paciente);

        verify(pacienteRepository).save(itemArgumentCaptor.capture());

        Paciente captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(paciente);
    }

}
