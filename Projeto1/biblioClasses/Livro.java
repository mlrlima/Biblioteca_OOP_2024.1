package biblioClasses;

public class Livro implements java.io.Serializable {
    
    //ATRIBUTOS

    private String titulo, autor;
    //genero:codigo do genero / code: codigo do livro
    private int genero, code; 
    //true== disponivel / false== emprestado
    private boolean status;
    private double rating;

    /* CÓDIGOS DE GÊNERO
     * 0 - Acao e Aventura
     * 1 - Misterio
     * 2 - Romance
     * 3 - Nao Ficcao
     * 4 - Sci-fi
     * 5 - Terror
     * 6 - Drama
     * 7 - Humor
     * 8 - Poesia
     * 9 - Filosofia
    */

//--------------getters e setters---------------//

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
//----------------------------------------------//
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }
 //----------------------------------------------//
    public void setCode(int newcode){
        this.code = newcode;
    }
    public int getCode(){
        return code;
    }
 //----------------------------------------------//
    public void setGenero(int genero){
        this.genero=genero;
    }
    public int getGenero(){
        return genero;
    }
 //----------------------------------------------//
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
 //----------------------------------------------//
    public void setRating(double rating){
        this.rating = rating;
    }
    public double getRating(){
        return rating;
    }
 //----------------------------------------------//
}
