# Projeto ContaBanco

Este projeto faz parte do desafio do módulo de Sintaxe do curso de Java da DIO. O objetivo é criar uma aplicação simples para simular a criação de uma conta bancária utilizando entradas fornecidas pelo usuário via terminal.

## Descrição

O projeto consiste em uma aplicação Java que solicita ao usuário as seguintes informações:

- **Número da Agência** (Texto)
- **Número da Conta** (Inteiro)
- **Nome do Cliente** (Texto)
- **Saldo Inicial** (Decimal)

Após a entrada dos dados, o programa exibe uma mensagem de confirmação com os detalhes da conta criada.

## Funcionalidades

- Recebe dados de entrada via terminal.
- Armazena e processa informações sobre uma conta bancária.
- Exibe uma mensagem final com todos os dados informados.

## Como Executar

1. Clone este repositório:
    ```bash
    git clone https://github.com/jpncaetano/dio-trilha-java-basico.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd dio-trilha-java-basico
    ```

3. Compile e execute o programa:
    ```bash
    javac src/ContaTerminal.java
    java -cp src ContaTerminal
    ```

4. Siga as instruções no terminal para inserir os dados.

## Exemplo de Uso

```bash
Por favor, digite o número da agência: 
123-4
Por favor, digite o número da conta: 
56789
Por favor, digite o nome do cliente: 
João Pedro
Por favor, digite o valor do depósito: 
2500.50

Olá, João Pedro! Obrigado por criar uma conta em nosso banco, sua agência é 123-4, conta 56789 e seu saldo de R$2500.50 já está disponível para saque.
```

## Tecnologias Utilizadas
Java 21
IntelliJ IDEA

## Autor

[João Caetano](https://github.com/jpncaetano)
