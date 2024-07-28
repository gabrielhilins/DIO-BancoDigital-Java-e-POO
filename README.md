# Banco Digital usando POO e Java

## Descrição
- O projeto BancoDigital é uma simulação de um sistema bancário simples, desenvolvido em Java. Ele foi criado como parte do Desafio da Digital Innovation One (DIO). O sistema permite a criação de clientes e contas bancárias, com suporte para dois tipos de contas: Conta Corrente e Conta Poupança. O sistema inclui funcionalidades básicas como depósito, saque, transferência entre contas e impressão de extratos.
- Funcionalidades
  Cadastro de Clientes: Armazena informações como nome, data de nascimento e telefone.
  Criação de Contas: Suporte para Conta Corrente e Conta Poupança.
  Operações Bancárias: Depósito, saque e transferência entre contas.
Extrato: Impressão de extratos detalhados das operações realizadas.
  
## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- Cliente: Representa os clientes do banco com informações pessoais.
- Conta: Classe abstrata que define operações comuns para contas bancárias.
- ContaCorrente: Especialização da classe Conta.
- ContaPoupanca: Outra especialização da classe Conta.
- Banco: Gerencia a lista de contas e operações relacionadas.
- Main: Classe principal com a interface de usuário para interação.

## Tecnologias e Conhecimentos Utilizados
- Princípios de Programação Orientada a Objetos (POO): Abstração, encapsulamento, herança e polimorfismo foram aplicados no design do sistema.
- Java 21: Linguagem de programação utilizada para o desenvolvimento do sistema.
- Maven: Ferramenta de automação de build e gerenciamento de dependências.
- Lombok: Biblioteca que reduz o boilerplate code através de anotações.
- IDE IntelliJ IDEA: Ambiente de desenvolvimento integrado utilizado no projeto.
- Git: Sistema de controle de versão utilizado para gerenciar o código-fonte.

