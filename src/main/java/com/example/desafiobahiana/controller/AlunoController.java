package com.example.desafiobahiana.controller;

import com.example.desafiobahiana.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.desafiobahiana.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;

//INDICA QUE ESSA CLASSE É UMA CONTROLLER E TERÁ METODOS QUE RESPONDERÁ A REQUISIÇÕES HTTP
@RestController

//DEFININDO ENDPOINT
@RequestMapping("/aluno")
public class AlunoController {

    //INJETA AUTOMATICAMENTE A DEPENDENCIA DA INTERFACE
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<AlunoEntity> buscarTodos(){
        return alunoRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<AlunoEntity> buscarPorId(@PathVariable Integer id){
        return alunoRepository.findById(id);
    }

    @PostMapping
    public AlunoEntity salvarAluno(@RequestBody AlunoEntity aln){
        return alunoRepository.save(aln);
    }

    @PutMapping("{id}")
    public AlunoEntity atualizar(@PathVariable Integer id, @RequestBody AlunoEntity alunoAtualizado){
        AlunoEntity aluno = alunoRepository.findById(id).get();
        aluno.setNome(alunoAtualizado.getNome());
        aluno.setIdade(alunoAtualizado.getIdade());
        aluno.setTurma(alunoAtualizado.getTurma());
        aluno.setResponsavel(alunoAtualizado.getResponsavel());
        return alunoRepository.save(aluno);
    }

    @DeleteMapping("{id}")
    private void deletar(@PathVariable Integer id){
        alunoRepository.deleteById(id);
    }

}
