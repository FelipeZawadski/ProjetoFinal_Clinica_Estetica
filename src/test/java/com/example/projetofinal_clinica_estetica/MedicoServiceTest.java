package com.example.projetofinal_clinica_estetica;

import com.example.projetofinal_clinica_estetica.model.Medico;
import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.repository.MedicoRepository;
import com.example.projetofinal_clinica_estetica.repository.PacienteRepository;
import com.example.projetofinal_clinica_estetica.service.MedicoService;
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
public class MedicoServiceTest {

    private MedicoService medicoService;

    @Mock
    private MedicoRepository medicoRepository;


    @BeforeEach
    void setUp() {
        medicoService = new MedicoService(medicoRepository);
    }


    @Test
    void verificarMedicoNome() {
        Medico medico = Medico.builder().nome("João").build();
        ArgumentCaptor<Medico> itemArgumentCaptor = ArgumentCaptor.forClass(Medico.class);

        medicoService.save(medico);

        verify(medicoRepository).save(itemArgumentCaptor.capture());

        Medico captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(medico);
    }

    @Test
    void verificarMedicoCpf() {
        Medico medico = Medico.builder().cpf("125.643.124.75").build();
        ArgumentCaptor<Medico> itemArgumentCaptor = ArgumentCaptor.forClass(Medico.class);

        medicoService.save(medico);

        verify(medicoRepository).save(itemArgumentCaptor.capture());

        Medico captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(medico);
    }

    @Test
    void verificarMedicoCrm() {
        Medico medico = Medico.builder().crm("523523").build();
        ArgumentCaptor<Medico> itemArgumentCaptor = ArgumentCaptor.forClass(Medico.class);

        medicoService.save(medico);

        verify(medicoRepository).save(itemArgumentCaptor.capture());

        Medico captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(medico);
    }


}
