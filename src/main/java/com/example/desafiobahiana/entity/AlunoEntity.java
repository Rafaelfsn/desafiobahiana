package com.example.desafiobahiana.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity //AQUI INFORMO QUE ESTA CLASSE É UMA ENTIDADE
@Data //ESTA ANOTACAO DO LOMBOK JÁ FAZ OS MÉTODOS ESPECIAIS GETTERS E SETTERS
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //COM ESTA LINHA É REALIZADO O AUTOINCREMENT DO ID
    private Integer id;

    private String Nome;

    /**
     * DEFININDO ATRIBUTO IDADE, POIS FOI SOLICITADO NO ENUCIADO QUE A API PERMITISSE A ENTRADA DO DADO "IDADE DO ALUNO"
     * PORÉM COMO BOAS PRATICAS, O CORRETO É CADASTRAR A DATA DE NASCIMENTO, VISTO QUE A IDADE É UM DADO VARIÁVEL E FICARIA DESATUALIZADO NO B.D
     */
    private int Idade;

    private String Responsavel;
    private String Turma;

}
