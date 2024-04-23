package Biblioteca;

public class Livro{
    protected String titulo, autor, id;
    protected int genero; //1- aventura, 2-misterio, 3- romance, 4- nao-ficcao, 5- sci-fi, 6- horror, 7- drama
    protected boolean status; //true== disponivel / false== emprestado
    double rating;
    double totalRating;

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

    void setRating(double rating){
        this.rating += rating;
        this.totalRating++;
    }
    double getRating(){
        return rating/total;
    }

    void incializarRating(){
        this.rating = 0
        this.totalRating = 0
    }
}