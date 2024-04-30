
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
        newbook.setCode(livros.size()-1);
        System.out.print("\033\143");
    }

    //FAZER EMPRESTIMO PARA USUÁRIO

    public void Emprestar(ArrayList<Livro> livros, int choiceCode, Pessoa user){

        if(user.getEmprestados().size() >= 6){
            System.out.println("Cliente já atingiu número máximo de livros");
            return;
        }

        if(livros.size() == 0){
            System.out.println("----------------------------------------");
            System.out.println("\tAinda não há livros.");
            System.out.println("----------------------------------------");
            return;
        }


        if(livros.get(choiceCode).getStatus() == true){

            System.out.println("----------------------------------------");
            System.out.println("\tLivro emprestado com sucesso!");
            System.out.println(livros.get(choiceCode).getTitulo());

            user.getEmprestados().add(livros.get(choiceCode));
            livros.get(choiceCode).switchStatus();
        }

        else{
            System.out.println("----------------------------------------");
            System.out.println("Livro indisponível ou inexistente");
        }

    }
    
    //FAZER DEVOLUCAO PARA USUARIO

    public void Devolver(int choiceCode, ArrayList<Livro> livros, Pessoa user){

        if (choiceCode >= livros.size()){
                        
            System.out.print("\033\143");
            System.out.println("Livro indisponível ou inexistente");
            return;
        }

        for(int i=0; i<user.getEmprestados().size(); i++){

            if(user.getEmprestados().get(i).getCode() == choiceCode){

                user.getEmprestados().get(i).switchStatus();
                user.getEmprestados().remove(i);
                return;
            }
        }

        System.out.println("Cliente não está com esse livro.");
    }


    public void resetBooks(ArrayList<Livro> livros){

        for(int i=0; i<livros.size(); i++){
            livros.get(i).setStatus();
        }
    }

}
