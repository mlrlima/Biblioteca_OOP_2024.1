# Projeto: Sistema de Gerenciamento de Biblioteca

**Universidade Católica de Pernambuco**

**Alunos:** 
- Maria Luiza Ribeiro de Lima (**RA:** 00000848982)
- Roberto Regis de Araújo Lima Neto (**RA:** 00000848959)
- Vínicius Martins Galindo Andrade (**RA:** 00000848753)

**Disciplina:** Programação Orientada a Objetos (2024.1)

**Professor:** Lucas Rodolfo

Uma biblioteca precisa de um sistema para gerenciar seus livros, clientes e empréstimos. O sistema deve permitir o cadastro de livros e clientes, bem como o controle de empréstimos

## Classes
    
- **Pessoa:** Esta é a classe base para qualquer pessoa envolvida no sistema.
  
    - <ins>Atributos</ins>: nome, CPF, senha, endereço, telefone.
    - <ins>Métodos</ins>: Getters e setters para os atributos. Métodos para Empréstimo e Devolução de livros e Login.

- **Cliente (herda de Pessoa):** Esta classe representa um cliente da biblioteca.
  
    - Atributos: livros emprestados (ArrayList). nome, CPF, senha, endereço, telefone. (herdados de Pessoa)
    - <ins>Métodos</ins>: Criação de conta.

- **Bibliotecário (herda de Pessoa):** Esta classe representa o administrador.
    -  <ins>Atributos</ins>: nome, CPF, senha, endereço, telefone. (herdados de Pessoa)
    -   <ins>Métodos</ins>: Criação de novo livro. Emprestar para usuário e Devolver para usuário (sobrescritos de Pessoa).

- **Livro:** Esta classe representa um livro na biblioteca.
    -  <ins>Atributos</ins>: título, autor, código do livro, status (disponível ou emprestado), gênero do livro.
    -   <ins>Métodos</ins>: getters e setters para os atributos.

- **Menu:** Esta classe contém os Menus de interação com o usuário
    - <ins>Métodos</ins>: Menu de Recepção, Menu do Cliente, Menu do Bibliotecario, Sistema de Recomendação
     
- **Biblioteca:** Esta classe representa a biblioteca e contém a lógica principal do sistema.
    - <ins>Atributos</ins>: lista de livros (ArrayList), lista de clientes (ArrayList), lista de CPF (ArrayList).
    - <ins>Métodos</ins>: Serialização e Deserialização dos ArrayLists (clientes, livros).

**As classes Pessoa, Cliente, Bibliotecário, Livro e Menu fazem parte do pacote biblioClasses, que é importado para a classe Biblioteca

## Polimorfismo

A classe Bibliotecario, que herda de Pessoa, sobrescreve os métodos de Empréstimo e Devolução de livros (Emprestar e Devolver) para que possa os fazer através da conta de qualquer usuário. Um Login temporário é feito para que o acesso aos dados da conta desejada seja efetuado.

## Encapsulamento

O encapsulamento é implementado através do uso de modificadores de acesso (private, public) para os atributos das classes. Os atributos são definidos como private e são acessados através de métodos públicos (getters e setters). Atributos que serão herdados para subclasses são definidos como protected.

## ArrayList 

ArrayList é usado para armazenar a lista de livros emprestados (na classe Pessoa) e a lista de livros, clientes e CPFs na biblioteca (na classe Biblioteca).

## Requisitos adicionais

- **Serialização:** Ao final da execução, os ArrayLists de usuários, livros e CPFs são serializados (convertidos em um fluxo de bytes) e, ao início da execução, são deserializados (resgatados desse mesmo fluxo de bytes). Dessa forma, as contas e livros criados e seus atributos não são perdidos ao final da execução.

- **Sistema de Recomendação:** Ao fazer o empréstimo, são recomendados livros que possam interessar o cliente . As recomendações são distribuídas de forma proporcional aos gêneros dos livros que ele emprestou anteriormente.

## Easter Egg ao cliente

Existe um livro secreto que, caso pego emprestado, gera uma animação de destruição da biblioteca.

![EasterEgg](https://i.imgur.com/GntehqG.gif)


## Demonstração

Menu de Recepção

![Menu de Recepção](https://github.com/mlrlima/Biblioteca_OOP_2024.1/assets/128704421/ccbad266-3d88-4e1a-ab40-18f5312cee4f)

Criação de Conta

![Criação de Conta](https://github.com/mlrlima/Biblioteca_OOP_2024.1/assets/128704421/9756aa8e-2056-43ed-9f5e-c728fb0ec523)

Menu de Usuário (empréstimos feito)

![Menu1](https://github.com/mlrlima/Biblioteca_OOP_2024.1/assets/128704421/e9779b83-6cf6-4364-8b02-105f2061653f)

Tela de Empréstimo e Sistem de Recomendação

![Emprestimo](https://github.com/mlrlima/Biblioteca_OOP_2024.1/assets/128704421/32b13875-e7e2-4253-a065-32f60d137fb7)

Menu de Bibliotecário

![Menu2](https://github.com/mlrlima/Biblioteca_OOP_2024.1/assets/128704421/e74628c9-45fd-4e97-b647-37212e216eb8)







