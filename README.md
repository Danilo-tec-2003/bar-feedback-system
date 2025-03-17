# Feedback System

## Descrição
O **Feedback System** é uma API REST desenvolvida em **Java com Spring Boot**, que permite que clientes avaliem um bar com base na qualidade do serviço, das bebidas e do ambiente. Os feedbacks são armazenados em um banco de dados e podem ser consultados pelos administradores para melhorar a experiência do cliente.

## Tecnologias Utilizadas
- **Java 23**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
  
  

## Funcionalidades
- **Cadastro de Feedbacks**: Clientes podem avaliar o serviço, as bebidas e o ambiente do bar.
- **Consulta de Feedbacks**: Administradores podem visualizar e filtrar os feedbacks.
- **Gerenciamento de Usuários** (se aplicável): Controle de acesso para admins e clientes.

## Como Executar o Projeto
### 1. Clonar o Repositório
```bash
  git clone https://github.com/seu-usuario/feedback-system.git
  cd feedback-system
```

### 2. Configurar o Banco de Dados
Altere o arquivo `application.properties` ou `application.yml` para conectar ao seu banco de dados PostgreSQL:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/feedback_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 3. Construir e Executar a Aplicação
```bash
  mvn clean install
  mvn spring-boot:run
```
A API estará disponível em: `http://localhost:8080`

## Documentação da API
Acesse a documentação via Swagger em:
```url
http://localhost:8080/swagger-ui.html
```

## Estrutura do Projeto
```
feedback-system/
│── src/
│   ├── main/java/com/seuusuario/feedbacksystem/
│   │   ├── controller/    # Controllers da API
│   │   ├── service/       # Regras de negócio
│   │   ├── repository/    # Repositórios JPA
│   │   ├── model/         # Entidades
│   │   ├── dto/           # Data Transfer Objects
│── src/test/java/...      # Testes unitários e de integração
│── pom.xml                # Dependências do projeto
│── README.md              # Documentação
```

## Status das Branches
- **`main`**: Contém a versão estável da API, mas ainda está faltando algumas funcionalidades que serão implementadas nas próximas releases.
- **`QA`**: Esta branch está sendo utilizada para testes, mas atualmente apresenta falhas que estão sendo corrigidas.

## Contribuição
Caso queira contribuir:
1. Fork este repositório.
2. Crie uma branch com sua feature/bugfix (`git checkout -b minha-feature`).
3. Faça commit das suas alterações (`git commit -m 'Adicionando nova funcionalidade'`).
4. Envie para o repositório remoto (`git push origin minha-feature`).
5. Abra um Pull Request.


