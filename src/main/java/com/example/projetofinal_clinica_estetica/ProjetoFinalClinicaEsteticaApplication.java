package com.example.projetofinal_clinica_estetica;


import com.example.projetofinal_clinica_estetica.model.MateriaisMedicos;
import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.service.CRUD.MateriaisMedicosService;
import com.example.projetofinal_clinica_estetica.service.SaidaMateriaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ProjetoFinalClinicaEsteticaApplication {

    @Autowired
    private MateriaisMedicosService materiaisMedicosService;

    private SaidaMateriaisService saidaMateriaisService;


    public static void main(String[] args) {
        SpringApplication.run(ProjetoFinalClinicaEsteticaApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        var adicionar = materiaisMedicosService.salvar(
                MateriaisMedicos.builder()
                        .nomeProduto("luva")
                        .qtd(10)
                        .build()
        );


    }

}
