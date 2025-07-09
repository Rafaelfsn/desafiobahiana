# Desafio Bahiana - API de Matrícula de Alunos

Este projeto é uma **API REST** desenvolvida em **Java com Spring Boot** para o cadastro e gerenciamento de alunos, contendo informações como nome, responsável, turma e idade.


---

## Tecnologias Utilizadas

- Java 21  
- Spring Boot 3.5.3  
- Spring Web  
- Spring Data JPA  
- Banco de Dados H2 (em memória)  
- Lombok  
- Maven  


---

## Como executar o projeto usando a IDE

1. **Importe o projeto** para sua IDE preferida (IntelliJ IDEA, Eclipse, VSCode, etc.) como um projeto Maven.

2. **Certifique-se de que o Java 21 está configurado na IDE** para execução.

3. **Localize e execute a classe principal**:

   - Abra o arquivo `DesafiobahianaApplication.java` na pasta `com.example.desafiobahiana`.
   - Execute o método `main` desta classe.

4. A aplicação irá iniciar um servidor local.

5. **Acesse a API** no endereço: http://localhost:8080


---

## Endpoints Disponíveis

| Método | Endpoint           | Descrição                      |
|--------|-------------------|-------------------------------|
| GET    | `/aluno`          | Lista todos os alunos          |
| GET    | `/aluno/{id}`     | Lista o aluno do id            |
| POST   | `/aluno`          | Cadastra um novo aluno         |
| PUT    | `/aluno/{id}`     | Atualiza os dados de um aluno  |
| DELETE | `/aluno/{id}`     | Remove um aluno do sistema     |

---

## Testar a API

Para testar os endpoints, use ferramentas como **Postman** ou **Insomnia**.

Exemplo de requisição `POST` para cadastrar um aluno:

```json
POST http://localhost:8080/aluno
Content-Type: application/json

{
"nome": "João da Silva",
"responsavel": "Maria Silva",
"turma": "A",
"idade": 10
}


## Banco de Dados H2
A aplicação utiliza o banco de dados em memória H2, que inicia automaticamente com a aplicação.
Não é necessário configurar nada manualmente.


Autor
Rafael
GitHub - @Rafaelfsn



