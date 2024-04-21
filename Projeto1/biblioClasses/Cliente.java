package biblioClasses;
import java.util.ArrayList;

public class Cliente extends Pessoa  {

    //ATRIBUTOS
    private ArrayList<Livro> BorrowedList = new ArrayList<Livro>();

    //getters e setters

    public ArrayList<Livro> getEmprestados() {
        return BorrowedList;
    }

    //EMPRESTAR

    public void Emprestar(Livro livro) {

        BorrowedList.add(livro);
    }

    //DEVOLVER

    public void Devolver() {
        
        System.out.println("\tLivros Emprestados:");

        for(int i=1; i<=BorrowedList.size(); i++){

            System.out.println(i+" - [" + i + "] " + BorrowedList.get(i).getTitulo() + " - " + 
            BorrowedList.get(i).getAutor());
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

        }while(bookChoice<0 && bookChoice>=BorrowedList.size());
        
        BorrowedList.remove(bookChoice);
    }

    public void printarEmprestimos(){

        if(BorrowedList.size()==0){
            System.out.println("Voce não possui livros emprestados.");
            return;
        }


        System.out.println("Livros emprestados:");
        for(int i=1; i<=BorrowedList.size(); i++){
            System.out.println(i+" - [" + i + "] " + BorrowedList.get(i).getTitulo() + " - " + BorrowedList.get(i).getAutor());
        }
    }

}
    
            
