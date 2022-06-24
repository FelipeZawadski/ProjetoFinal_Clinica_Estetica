package com.example.projetofinal_clinica_estetica;

import com.example.projetofinal_clinica_estetica.model.Medico;
import com.example.projetofinal_clinica_estetica.model.Paciente;
import com.example.projetofinal_clinica_estetica.service.CRUD.impl.ProcedimentoServiceImpl;
import com.example.projetofinal_clinica_estetica.service.ProcedimentoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProjetoFinalClinicaEsteticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoFinalClinicaEsteticaApplication.class, args);

        ProcedimentoService procedimentoService = new ProcedimentoServiceImpl();


    }

}
