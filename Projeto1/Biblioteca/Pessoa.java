package Biblioteca;
import java.util.*;

public class Pessoa{
    protected String nome, endereco, telefone,senha;
    protected ArrayList<Livro> livrosEmprestados =new ArrayList<>();

    void setNome(String nome){
        this.nome=nome;
    }
    String getNome(){
        return nome;
    }

    void setSenha(String senha){
        this.senha=senha;
    }
    String getSenha(){
        return senha;
    }

    void setEndereco(String endereco){
        this.endereco=endereco;
    }
    String getEndereco(){
        return endereco;
    }

    void setTelefone(String telefone){
        this.telefone=telefone;
    }
    String getTelefone(){
        return telefone;
    }
    public void emprestarLivro(Livro livro) {

        livrosEmprestados.add(livro);
    }

    public void devolverLivro() {
        
        System.out.println("\tLivros Emprestados:");

        for(int i=1; i<=livrosEmprestados.size(); i++){

            System.out.println(i+" - [" + i + "] " + livrosEmprestados.get(i).getTitulo() + " - " + livrosEmprestados.get(i).getAutor());
        }
        System.out.println("----------------------------------------");
        System.out.print("\t Número do livro a Devolver");
        System.out.println("----------------------------------------");
        System.out.print("--> ");

        int bookChoice;
        do{
            bookChoice = input.nextInt();
            input.nextLine();
            bookChoice--;

        }while(bookChoice<0 && bookChoice>=livrosEmprestados.size());
        
        livrosEmprestados.remove(bookChoice);
    }

    public void printarEmprestimos(){
        if(livrosEmprestados.size()==0){
            System.out.println("Voce não possui livros emprestados.");
            return;
        }


        System.out.println("Livros emprestados:");
        for(int i=1; i<=livrosEmprestados.size(); i++){
            System.out.println(i+" - [" + i + "] " + livrosEmprestados.get(i).getTitulo() + " - " + livrosEmprestados.get(i).getAutor());
        }
    }

    public void recomendar(ArrayList<Livro> livrosEmprestados){
        
    }
    

                
