# 🍻 Bar Feedback System - API REST

![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![Java](https://img.shields.io/badge/Java-23%2B-blue?logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring%20Boot-3.x-green?logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-blue?logo=postgresql&logoColor=white)

O **Feedback System** é uma API REST desenvolvida em **Java com Spring Boot**, que permite que clientes avaliem um bar com base na qualidade do serviço, das bebidas e do ambiente. Os feedbacks são armazenados para consulta e melhoria da experiência do cliente.

---

## 📋 Índice

- [✨ Features Principais](#-features-principais)
- [🚀 Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [🧠 Decisões de Arquitetura](#-decisões-de-arquitetura)
- [🛠️ Como Executar o Projeto](#️-como-executar-o-projeto)
- [🌳 Fluxo de Commits (Git Flow)](#-fluxo-de-commits-git-flow)
- [👨‍💻 Autor](#-autor)

---

## ✨ Features Principais

- **Cadastro de Feedbacks**: Clientes podem avaliar o serviço, as bebidas e o ambiente do bar.
- **Consulta de Feedbacks**: Administradores podem visualizar e filtrar os feedbacks.
- **Gerenciamento de Usuários**: Controle de acesso para administradores e clientes.
- **Documentação da API**: Geração automática da documentação com SpringDoc (Swagger) para fácil consumo.

---

## 🚀 Tecnologias Utilizadas

- **Backend:**
  - Java 23
  - Spring Boot 3.x
  - Spring Data JPA (Hibernate)
  - SpringDoc (Swagger)
- **Banco de Dados:**
  - PostgreSQL
- **Ferramentas de Build e Ambiente:**
  - Maven
  - Git & GitHub

---

## 🧠 Decisões de Arquitetura

Mesmo sendo um projeto para fins de estudo, optei por aplicar práticas de mercado que demonstram organização e escalabilidade.

1.  **Arquitetura em Camadas (Layered Architecture):**
    O projeto foi dividido em camadas de responsabilidade única, seguindo o padrão do Spring:
    - `controller`: Lida exclusivamente com as requisições HTTP (endpoints da API).
    - `service`: Orquestra a lógica de negócio da aplicação.
    - `repository`: É a única camada responsável pela comunicação com o banco de dados via JPA.
    - `model`: Representa as entidades do banco de dados (ex: Feedback, User).

2.  **Padrão RESTful:**
    A API segue os princípios REST, utilizando os verbos HTTP corretos (`GET`, `POST`, `PUT`, `DELETE`) e códigos de status apropriados para representar o resultado das operações.

---

## 🛠️ Como Executar o Projeto

**Pré-requisitos:**
- Java (JDK) 23 ou superior
- Maven 3.8 ou superior
- PostgreSQL (rodando localmente ou em um container)

**Passo a passo:**

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Danilo-tec-2003/bar-feedback-system.git](https://github.com/Danilo-tec-2003/bar-feedback-system.git)
    cd bar-feedback-system
    ```

2.  **Configure o Banco de Dados:**
    Crie um banco de dados no PostgreSQL (ex: `feedback_db`).
    Ajuste o arquivo `src/main/resources/application.properties` com suas credenciais:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/feedback_db
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    ```

3.  **Execute a aplicação Spring Boot:**
    Use o Maven para compilar e iniciar o projeto:
    ```bash
    mvn spring-boot:run
    ```

4.  **Acesse a aplicação:**
    A API estará disponível em: `http://localhost:8080`
    
    A documentação do Swagger UI poderá ser acessada em: `http://localhost:8080/swagger-ui.html`

---

## 🌳 Fluxo de Commits (Git Flow)

Para o versionamento, utilizei o seguinte fluxo de trabalho:
- `main`: Contém a versão estável da API, mas ainda faltando funcionalidades que serão implementadas nas próximas releases.
- `QA`: Esta branch está sendo utilizada para testes, mas atualmente apresenta falhas que estão sendo corrigidas.
- Os commits seguem o padrão de **Commits Semânticos** (`feat`, `fix`, `style`, `docs`, etc.) para manter o histórico do projeto limpo e organizado.

---

## 👨‍💻 Autor

- **Danilo Mendes de Araujo**
- **LinkedIn:** (https://www.linkedin.com/in/danilomendesaraujo/)
- **GitHub:** (https://github.com/Danilo-tec-2003)
