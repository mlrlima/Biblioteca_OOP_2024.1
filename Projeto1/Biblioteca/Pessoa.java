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

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public void recomendar(ArrayList<Livro> livrosEmprestados){
        //int generos=50;
       // int[50] quantidade=0;

        //for(int i=0;i<n;i++){
        //    quantidade[livrosEmprestados[i].getGenero()]++;
        //}
    }
}
                
