#  Carteira Digital

##  Descrição

O projeto consiste no desenvolvimento de uma aplicação simples de carteira digital, como atividade prática da disciplina de Gestão e Qualidade de Software.

O sistema permite que o usuário realize depósitos e pagamentos, mantendo o controle correto do saldo disponível. Também possui validações para impedir operações inválidas, como depósitos com valores negativos ou pagamentos com saldo insuficiente.

O objetivo é aplicar conceitos de desenvolvimento de software, controle de qualidade e testes automatizados, garantindo que as funcionalidades sejam executadas corretamente e que o sistema apresente resultados confiáveis.

## Integrantes

- Juan Pablo de Freitas Lemos Galvão - RA 42320070
- Milena Júlia Mafra - RA 42320102
- Rafael Augusto Proença - RA 42321742

## Instruções de Execução

### Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- Java JDK 17 ou superior.
- Maven.
- Git.

### 1. Clonar o repositório

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Acessar a pasta do projeto

```bash
cd NOME_DO_PROJETO
```

### 3. Compilar o projeto

```bash
mvn clean compile
```

### 4. Executar os testes automatizados

```bash
mvn test
```

Esse comando executa os testes automatizados do projeto, verificando o funcionamento das operações de depósito e pagamento, além das validações de saldo e valores inválidos.

### 5. Executar a aplicação

A execução deve ser realizada por meio da classe principal do projeto, utilizando a IDE (IntelliJ IDEA, Eclipse ou VS Code) ou o comando Maven configurado para iniciar a aplicação.