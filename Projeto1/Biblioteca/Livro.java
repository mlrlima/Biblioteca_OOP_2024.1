package Biblioteca;

public class Livro{
    protected String titulo, autor, id;
    protected int genero;
    protected boolean status; //true== disponivel / false== emprestado
    double rating;

    void setTitulo(String titulo){
        this.titulo=titulo;
    }
    String getTitulo(){
        return titulo;
    }

    void setGenero(int genero){
        this.genero=genero;
    }
    int getGenero(){
        return genero;
    }

    void setAutor(String autor){
        this.autor=autor;
    }
    String getAutor(){
        return autor;
    }

    void setId(String id){
        this.id=id;
    }
    String getId(){
        return id;
    }

    void setDisponivel(){
        this.status= true;
    }
    void setEmprestado(){
        this.status= false;
    }
    boolean getStatus(){
        return status;
    }
}
