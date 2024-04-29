package biblioClasses;

public class Livro implements java.io.Serializable {
    
    //ATRIBUTOS

    private String titulo, autor;
    private int genero, code;
    private boolean status; //true== disponivel / false== emprestado
    private double rating;

    /* CÓDIGOS DE GÊNERO
     * 1 - 
     */


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

    public void setCode(int newcode){
        this.code = newcode;
    }
    public int getCode(){
        return code;
    }

    public void setGenero(int genero){
        this.genero=genero;
    }
    public int getGenero(){
        return genero;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(){
        this.status = true;
    }
    public void switchStatus(){

        if (status){
            this.status= false;
        }
        
        else{
            this.status= true;
        }
    }

    public void setRating(double rating){
        this.rating = rating;
    }
    public double getRating(){
        return rating;
    }
}
