package com.example.projetofinal_clinica_estetica;


import com.example.projetofinal_clinica_estetica.model.*;
import com.example.projetofinal_clinica_estetica.service.*;
import com.example.projetofinal_clinica_estetica.service.CRUD.MateriaisMedicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class ProjetoFinalClinicaEsteticaApplication {

    @Autowired
    private MateriaisMedicosService materiaisMedicosService;

    @Autowired
    private AgendamentoService agendamentoService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private ProcedimentoService procedimentoService;

    @Autowired
    private SaidaMateriaisService saidaMateriaisService;


    public static void main(String[] args) {
        SpringApplication.run(ProjetoFinalClinicaEsteticaApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        var adicionarMaterial = materiaisMedicosService.salvar(
                MateriaisMedicos.builder()
                        .nomeProduto("luva")
                        .qtd(10)
                        .build()
        );

        var adicionarPaciente = pacienteService.salvar(
                Paciente.builder()
                        .cpf("123")
                        .data_nascimento(LocalDate.now())
                        .nome("Felipe")
                        .telefone("99096486")
                        .build()
        );

        var adicionarMedico = medicoService.salvar(
                Medico.builder()
                        .especializacao("Estetica")
                        .cpf("321")
                        .crm("0001")
                        .nome("João")
                        .build()
        );

        var adicionarProcedimento = procedimentoService.salvar(
                Procedimento.builder()
                        .data(LocalDateTime.now())
                        .medico(adicionarMedico)
                        .materiaisMedicos(adicionarMaterial)
                        .build()
        );

        var adicionarAgendamento = agendamentoService.salvar(
                Agendamento.builder()
                        .data_consulta(LocalDate.now())
                        .paciente(adicionarPaciente)
                        .medico(adicionarMedico)
                        .procedimento(adicionarProcedimento)
                        .build()
        );


        //medicoService.delete(adicionarMedico);
    }

}
