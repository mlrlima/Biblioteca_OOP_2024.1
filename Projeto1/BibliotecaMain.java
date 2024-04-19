
import Biblioteca.*;

import java.util.*;
import java.io.*;
import java.time.*;

class BibliotecaMain {
    
    //Listas de Livros Clientes
    ArrayList <Cliente> listaCliente = new ArrayList <Cliente>();
    ArrayList <Livro> listaLivro = new ArrayList <Livro>();


    public void addLivro(Livro livro) {
        listaLivro.add(livro);
    }
    
    public void removerLivro(Livro livro) {
        listaLivro.remove(livro);
    }
    
    public void addCliente(Cliente cliente) {
        listaCliente.add(cliente);
    }
    
    public void removerCliente(Cliente cliente) {
        listaCliente.remove(cliente);
    }
    
    public void interfaceUser(String usuario){
        System.out.println("----------------------------------------");
        System.out.println("\tBEM-VINDO, USUARIO!!!");
        System.out.println("----------------------------------------");
        System.out.println("\n\t[0] Encerrar \t[1] Pegar livro emprestado \n\t[2] Checar empréstimos \n\t[3] Devolução  ");
        System.out.println("----------------------------------------");
        System.out.print("--> ");
    }

    static void criarConta(){
        Scanner s=new Scanner(System.in);
    
        System.out.println("----------------------------------------");
        System.out.println("CRIAR CONTA\t");
        System.out.println("----------------------------------------");
    
        
        String cpf, nome, senha, endereco, telefone;
        
        System.out.println("Digite seu nome: ");
        nome = s.nextLine();
        s.nextLine();
    
        System.out.println("Digite seu endereco: ");
        nome = s.nextLine();
        s.nextLine();
    
        do{
            System.out.println("Digite seu telefone: ");
            telefone = s.nextLine();
            s.nextLine();
        }while(telefone.length()>13 || telefone.length()<9);
    
    
        do{
            System.out.println("Digite seu CPF: ")
            id = s.nextLine();
            s.nextLine();
        }while(id.length()!=11);
    
        do{
            System.out.println("Crie uma senha: (8 ou mais caracteres)")
            senha = s.nextLine();
            s.nextLine();
        }while(senha.length()<8);
    
        System.out.println("----------------------------------------");
        System.out.println("CONTA CRIADA!\t");
        System.out.println("----------------------------------------");
    
        String senhauppercase=senha.toUpperCase();
        int tamanhodasenha=senha.lenght();

        Cliente c= new Cliente();
        c.setIdCliente(id);
        c.setNome(nome);
        c.setEndereco(endereco);
        c.setTelefone(telefone);
        c.setSenha(senha);

        listaCliente.add(c);
    }

    static void entrarConta(){
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("\tENTRAR");
        System.out.println("----------------------------------------");

        String usuario;
        do{
            boolean existe=false;
            usuario=input.nextLine();
            input.nextLine();

            System.out.println("\tDigite seu CPF: ");

            for(Cliente c:listaCliente){
                String ID = listaCliente.get(c).getIdCliente();
                if(ID == usuario){
                    existe=true;
                    break;
                }
            }


            if(!existe){
                System.out.println("\tUsuario não encontrado.");
            }

        }while(!existe);

        do{
            String senha;
            boolean existe=false;
            senha=input.nextLine();
            input.nextLine();

            System.out.println("\tDigite sua senha: ");

            for(Cliente c:listaCliente){
                String s = listaCliente.get(c).getSenha();
                if(s == senha){
                    existe=true;
                    break;
                }
            }


            if(!existe){
                System.out.println("\tSenha incorreta.");
            }

        }while(!existe);

        interfaceUser(usuario);

    }

    
    static int inicializarMenu(){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("----------------------------------------");
            System.out.println("\tSISTEMA BIBLIOTECÁRIO UNICAP");
            System.out.println("----------------------------------------");
            System.out.println("\t[1] Entrar\n\t[2] Nova Conta\n\t[3] Encerrar");
            System.out.println("----------------------------------------");
            System.out.print("--> ");

            int choice = input.nextInt();
            input.nextLine();

        }while(choice<1 || choice>3);

        return choice;
}

    public static void main(String[] args){
        int choice;
        do{
            choice=inicializarMenu();
            switch(choice){
                case 2:
                    criarConta();

                case 1:
                    entrarConta();
            }
        }while(choice!=3);

        System.out.println("----------------------------------------");
        System.out.println("\nObrigado pela preferência.");
        System.out.println("----------------------------------------");
        return;
    }
}