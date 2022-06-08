package com.example.projetofinal_clinica_estetica.service.CRUD;


import com.example.projetofinal_clinica_estetica.repository.RegistroEstoqueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public record RegistroEstoqueService (RegistroEstoqueRepository registroEstoqueRepository){
}
