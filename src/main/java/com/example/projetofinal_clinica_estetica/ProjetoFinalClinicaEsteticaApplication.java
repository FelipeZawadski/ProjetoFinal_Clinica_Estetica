package com.example.projetofinal_clinica_estetica;


import com.example.projetofinal_clinica_estetica.model.*;
import com.example.projetofinal_clinica_estetica.model.dto.ItemQuantidade;
import com.example.projetofinal_clinica_estetica.service.*;
import com.example.projetofinal_clinica_estetica.service.CRUD.MateriaisMedicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.example.projetofinal_clinica_estetica.model.enums.ProcedimentoTipo.*;

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

    @Autowired
    private EntradaMateriaisService entradaMateriaisService;

    @Autowired
    private ProcedimentoMaterialService procedimentoMaterialService;


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
        var adicionarMaterial2 = materiaisMedicosService.salvar(
                MateriaisMedicos.builder()
                        .nomeProduto("atadura")
                        .qtd(5)
                        .build()
        );
        var adicionarMaterial3 = materiaisMedicosService.salvar(
                MateriaisMedicos.builder()
                        .nomeProduto("gazes")
                        .qtd(25)
                        .build()
        );
        var adicionarMaterial4 = materiaisMedicosService.salvar(
                MateriaisMedicos.builder()
                        .nomeProduto("soro")
                        .qtd(2)
                        .build()
        );

        var adicionarPaciente = pacienteService.salvar(
                Paciente.builder()
                        .cpf("123.456.789.10")
                        .data_nascimento(LocalDate.of(2000,10,10))
                        .nome("Felipe")
                        .telefone("99096486")
                        .build()
        );
        var adicionarPaciente2 = pacienteService.salvar(
                Paciente.builder()
                        .cpf("987.765.432.01")
                        .data_nascimento(LocalDate.of(1990,05,9))
                        .nome("João")
                        .telefone("999820465")
                        .build()
        );
        var adicionarPaciente3 = pacienteService.salvar(
                Paciente.builder()
                        .cpf("745.192.102.43")
                        .data_nascimento(LocalDate.of(2005,06,12))
                        .nome("Amanda")
                        .telefone("999324560")
                        .build()
        );
        var adicionarPaciente4 = pacienteService.salvar(
                Paciente.builder()
                        .cpf("912.543.654.12")
                        .data_nascimento(LocalDate.of(1989,03,29))
                        .nome("Ana")
                        .telefone("999654201")
                        .build()
        );

        var adicionarMedico = medicoService.salvar(
                Medico.builder()
                        .especializacao("Estetica")
                        .cpf("321")
                        .crm("0001")
                        .nome("Jeferson")
                        .build()
        );
        var adicionarMedico2 = medicoService.salvar(
                Medico.builder()
                        .especializacao("Dermatologia")
                        .cpf("123")
                        .crm("0002")
                        .nome("Julia")
                        .build()
        );

        var adicionarProcedimento = procedimentoService.salvar(
                Procedimento.builder()
                        .data(LocalDateTime.now())
                        .medico(adicionarMedico)
                        .procedimentoTipo(APLICACAO_BOTOX)
                        .materiaisMedicos(adicionarMaterial)
                        .build()
        );
        var adicionarProcedimento2 = procedimentoService.salvar(
                Procedimento.builder()
                        .data(LocalDateTime.now())
                        .medico(adicionarMedico)
                        .procedimentoTipo(APLICACAO_BOTOX)
                        .materiaisMedicos(adicionarMaterial2)
                        .build()
        );
        var adicionarProcedimento3 = procedimentoService.salvar(
                Procedimento.builder()
                        .data(LocalDateTime.now())
                        .medico(adicionarMedico2)
                        .procedimentoTipo(DRENAGEM)
                        .materiaisMedicos(adicionarMaterial3)
                        .build()
        );
        var adicionarProcedimento4 = procedimentoService.salvar(
                Procedimento.builder()
                        .data(LocalDateTime.now())
                        .medico(adicionarMedico2)
                        .procedimentoTipo(HARMONIZACAO_FACIAL)
                        .materiaisMedicos(adicionarMaterial2)
                        .build()
        );

        var adicionarAgendamento = agendamentoService.salvar(
                Agendamento.builder()
                        .data_consulta(LocalDate.of(2022,06,30))
                        .paciente(adicionarPaciente)
                        .medico(adicionarMedico)
                        .procedimento(adicionarProcedimento)
                        .build()
        );
        var adicionarAgendamento2 = agendamentoService.salvar(
                Agendamento.builder()
                        .data_consulta(LocalDate.of(2022,06,30))
                        .paciente(adicionarPaciente2)
                        .medico(adicionarMedico2)
                        .procedimento(adicionarProcedimento2)
                        .build()
        );
        var adicionarAgendamento3 = agendamentoService.salvar(
                Agendamento.builder()
                        .data_consulta(LocalDate.of(2022,06,30))
                        .paciente(adicionarPaciente3)
                        .medico(adicionarMedico2)
                        .procedimento(adicionarProcedimento3)
                        .build()
        );
        var adicionarAgendamento4 = agendamentoService.salvar(
                Agendamento.builder()
                        .data_consulta(LocalDate.of(2022,07,1))
                        .paciente(adicionarPaciente4)
                        .medico(adicionarMedico)
                        .procedimento(adicionarProcedimento4)
                        .build()
        );

        var adicionarProcedimentoMaterial = procedimentoMaterialService.salvar(
                ProcedimentoMaterial.builder()
                        .procedimento(adicionarProcedimento)
                        .materiaisMedicos(adicionarMaterial)
                        .quantidade(3.0)
                        .build()
        );

        ItemQuantidade itemQuantidade = new ItemQuantidade(adicionarMaterial, 8.0);
        List<ItemQuantidade> listaQuantidade = new ArrayList<>();
        listaQuantidade.add(itemQuantidade);
        entradaMateriaisService.entradaListaMateriais(listaQuantidade);

        ProcedimentoMaterial procedimentoMaterial = new ProcedimentoMaterial(1,adicionarProcedimento,adicionarMaterial2,2.0);
        List<ProcedimentoMaterial> listaProcedimento = new ArrayList<>();
        listaProcedimento.add(procedimentoMaterial);
        saidaMateriaisService.removerMateriaisEstoque(listaProcedimento);

    }

}
