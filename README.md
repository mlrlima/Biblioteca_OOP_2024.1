# SEGUNDO PROJETO DA DISCIPLINA DE POO

**Universidade Católica de Pernambuco**

**Nome:** Maria Luiza Ribeiro de Lima **RA:** 00000848982

**Nome:** Roberto Regis de Araújo Lima Neto **RA:** 00000848959

**Nome:** Vínicius Martins Galindo Andrade **RA:** 00000848753

**Disciplina:** Programação Orientada a Objetos (2024.1)

**Professor:** Lucas Rodolfo

# Descrição\Entrega

Além dos requisitos básicos (descrição do projeto abaixo), está incluso:

    -Contas distintas para clientes e bibliotecários, com funções também distintas.
    
    -Sistema de recomendação de livros baseado nos gêneros.
    
    -O bibliotecário pode adicionar novo livro à biblioteca; emprestar um livro por um cliente;

    -Easter eggs: 



# Projeto: Sistema de Gerenciamento de Biblioteca

Contexto: Uma biblioteca precisa de um sistema para gerenciar seus livros, clientes e empréstimos. O sistema deve permitir o cadastro de livros e clientes, bem como o controle de empréstimos.Requisitos do Projeto: 

**1.Classes(10%):**
    
    -Pessoa: Esta é a classe base para qualquer pessoa envolvida no sistema.
         1.Atributos: nome, endereço, telefone.
         2.Métodos: getterse setterspara os atributos.
    
    -Cliente(herda de Pessoa): Esta classe representa um cliente da biblioteca.
         1.Atributos: id do cliente,            livros emprestados (ArrayList).
         2.Métodos: getterse setterspara os atributos, emprestar livro, devolver livro.o
    
    -Livro: Esta classe representa um livro na biblioteca.
         1.Atributos: título, autor, id do livro, status (disponível ou emprestado).
         2.Métodos: getterse setterspara os atributos.
         
    -Biblioteca: Esta classe representa a biblioteca e contém a lógica principal do sistema.
         1.Atributos: lista de livros (ArrayList), lista de clientes (ArrayList).
         2.Métodos: adicionar livro, remover livro, adicionar cliente, remover cliente, emprestar livro, devolver livro.2.

**Polimorfismo(5%):** Você pode implementar polimorfismo na classe Pessoa. Por exemplo, a classe Pessoa pode ter um método imprimirDetalhes() que imprime os detalhes da pessoa. A classe Cliente, que herda de Pessoa, pode sobrescrever este método para incluir** detalhes adicionais, como o id do cliente e os livros emprestados.

**3.Abstração(10%):** A abstração é implementada através das classes e métodos descritos acima. Cada classe representa uma entidade distinta (Pessoa, Cliente, Livro, Biblioteca) e cada método representa uma ação que pode ser realizada por essa entidade.

**4.Encapsulamento(5%):** O encapsulamento é implementado através do uso de modificadores de acesso (private, public) para os atributos das classes. Os atributos são definidos como privados e são acessados através de métodos públicos (getters e setters).

**5.ArrayList(5%):** ArrayList é usado para armazenar a lista de livros emprestados por um cliente (na classe Cliente) e a lista de livros e clientes na biblioteca (na classe Biblioteca).

**6.Entrega(5%):** Link do GitHub via Teams. No GitHub deve conter o código, além de screenshots da interface do usuário. Um readme com uma breve descrição do que foi feito deve estar preenchido. A equipe toda deve ter acesso ao GitHub compartilhado (é um projeto em equipe).

**7.Requisitos adicionais(30%):** Será considerado o que for feito além do requerimento mínimo esperado.

**8.Easter Egg ao cliente(10%):** Surpreenda o cliente com algo interessante.

**9.Apresentação(20%):** Pitch de no máximo 10 minutos vendendo a ideia. Será avaliado pela turma (cliente em potencial) por votação (kahoot) qual o melhor projeto(comprou a ideia) entre dois projetos apresentados
