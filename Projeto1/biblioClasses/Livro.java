package biblioClasses;


public class Livro {
    
    //ATRIBUTOS

    private String titulo, autor, id;
    private int genero;
    private boolean status; //true== disponivel / false== emprestado
    private double rating;

    //getters e setters

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }

    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }

    public void setGenero(int genero){
        this.genero=genero;
    }
    public int getGenero(){
        return genero;
    }

    public void setDisponivel(){
        this.status= true;
    }
    public void setEmprestado(){
        this.status= false;
    }
    public boolean getStatus(){
        return status;
    }

    public double getRating(){
        return rating;
    }
}
