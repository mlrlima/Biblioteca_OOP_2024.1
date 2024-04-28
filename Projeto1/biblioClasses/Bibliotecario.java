
package biblioClasses;
import java.util.ArrayList;

public class Bibliotecario extends Pessoa{
    


    //Adiciona novo livro a base de dados

    public void newBook(ArrayList<Livro> livros){

        System.out.println("----------------------------------------");
        System.out.println("\t Registrar novo livro");
        System.out.println("----------------------------------------");

        Livro newbook = new Livro();

        String textinput;

        System.out.println("título:");
        textinput = input.nextLine();
        newbook.setTitulo(textinput);

        System.out.println("autor:");
        textinput = input.nextLine();
        newbook.setAutor(textinput);
        
        System.out.println("genero (codigo):");
        int newgenero = input.nextInt();
        input.nextLine();
        newbook.setGenero(newgenero);
        newbook.setStatus();

        livros.add(newbook);
    }


    

}
