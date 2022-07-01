package com.example.projetofinal_clinica_estetica;

import com.example.projetofinal_clinica_estetica.model.Agendamento;
import com.example.projetofinal_clinica_estetica.model.Procedimento;
import com.example.projetofinal_clinica_estetica.repository.AgendamentoRepository;
import com.example.projetofinal_clinica_estetica.repository.ProcedimentoRepository;
import com.example.projetofinal_clinica_estetica.service.AgendamentoService;
import com.example.projetofinal_clinica_estetica.service.ProcedimentoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class ProcedimentoServiceTest {

    private ProcedimentoService procedimentoService;

    @Mock
    private ProcedimentoRepository procedimentoRepository;


    @BeforeEach
    void setUp() {
        procedimentoService = new ProcedimentoService(procedimentoRepository);
    }


    @Test
    void verificarProcedimentoData() {
        Procedimento procedimento = Procedimento.builder().data(LocalDateTime.now()).build();
        ArgumentCaptor<Procedimento> itemArgumentCaptor = ArgumentCaptor.forClass(Procedimento.class);

        procedimentoService.save(procedimento);

        verify(procedimentoRepository).save(itemArgumentCaptor.capture());

        Procedimento captured = itemArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(procedimento);
    }

}
