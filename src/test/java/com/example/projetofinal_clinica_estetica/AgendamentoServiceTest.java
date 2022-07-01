package com.example.projetofinal_clinica_estetica;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import com.example.projetofinal_clinica_estetica.repository.AgendamentoRepository;
import com.example.projetofinal_clinica_estetica.service.AgendamentoService;
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
public class AgendamentoServiceTest {

    private AgendamentoService agendamentoService;

    @Mock
    private AgendamentoRepository agendamentoRepository;


    @BeforeEach
    void setUp() {
        agendamentoService = new AgendamentoService(agendamentoRepository);
    }


    @Test
    void salvarAgendamento() {
        Agendamento agendamento = Agendamento.builder().data_consulta(LocalDate.now()).build();
        ArgumentCaptor<Agendamento> itemArgumentCaptor = ArgumentCaptor.forClass(Agendamento.class);

        agendamentoService.save(agendamento);

        verify(agendamentoRepository).save(itemArgumentCaptor.capture());

        Agendamento captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(agendamento);
    }

}
