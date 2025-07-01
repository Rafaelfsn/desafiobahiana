package com.example.desafiobahiana.repository;

import com.example.desafiobahiana.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ESTA INTERFACE É RESPONSAVEL POR ACESSAR O BANCO PARA A ENTIDADE "AlunoEntity"
 * COM O EXTENDS ELA HERDA MÉTODOS PRONTOS PARA REALIZAR UM CRUD
 */

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer> {
}
