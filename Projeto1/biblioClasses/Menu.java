

package biblioClasses;
import java.util.*;
import java.lang.Math;

public class Menu {

    Scanner input = new Scanner(System.in);

    public int Reception(){
        
        System.out.println("----------------------------------------");
        System.out.println("\tBIBLIOTECA UNICAP");
        System.out.println("----------------------------------------");
        System.out.println("\t[1] Entrar\n\t[2] Nova Conta\n\t[3] Encerrar");
        System.out.println("----------------------------------------");
        System.out.print("--> ");


        int choice = input.nextInt();
        input.nextLine();
        System.out.print("\033\143");

        return choice;
    }
    
    public void MenuCliente(Pessoa user, ArrayList<Livro> bookList) {

        boolean menu = true;
        int choice;

        while(menu) {

            do{
                
                System.out.println("----------------------------------------");
                System.out.println("- Usuário: " + user.getNome());
                System.out.println("- Livros Emprestados (" + user.getEmprestados().size() + "):\n");

                for(int i=0; i<user.BorrowedList.size(); i++){


                    System.out.println(" -> [" + user.BorrowedList.get(i).getCode() + "] " + 
                    user.BorrowedList.get(i).getTitulo() + " - " + 
                    user.BorrowedList.get(i).getAutor());
                }

                System.out.println("----------------------------------------");
                System.out.println(
                "\t[1] Empréstimo \n\t" 
                + "[2] Devolução \n\t"
                + "[3] Logout ");
                System.out.println("----------------------------------------");
                System.out.print("--> ");
                choice = input.nextInt();
                input.nextLine();
                System.out.print("\033\143");

            } while(choice<0 || choice>4);

            int choiceCode;

            switch(choice) {

                case 1: //EMPRESTIMO

                    System.out.println("----------------------------------------");
                    System.out.println("\tRealizar Empréstimo");
                    System.out.println("----------------------------------------");
                    
                    if(user.getEmprestados().size() > 0){

                    System.out.println("Baseado em suas preferências, talvez goste:");

                    Recomendar(user.getGenerosHist(), bookList);

                    System.out.println("----------------------------------------");
                    }
                    

                    System.out.print("--> ");
                    choiceCode = input.nextInt();
                    input.nextLine();
                    System.out.print("\033\143");

                    if(choiceCode > (bookList.size()-1)){
                        System.out.println("Livro inexistente");
                        break;
                    }

                    user.Emprestar(bookList, choiceCode);

                    break;


                case 2: //Devolucao
                
                    if(user.getEmprestados().size()==0){
                        System.out.println("Voce não possui livros emprestados.");
                        break;
                    }

                    System.out.println("\tLivros Emprestados:");

                    for(int i=0; i<user.BorrowedList.size(); i++){

                        int code = user.BorrowedList.get(i).getCode();

                        System.out.println(" -> [" + code + "] " + 
                        user.BorrowedList.get(i).getTitulo() + " - " + 
                        user.BorrowedList.get(i).getAutor());
                    }

                    System.out.println("----------------------------------------");
                    System.out.println("\tDevolver");
                    System.out.println("----------------------------------------");
                    System.out.print("--> ");

                    try{
                        choiceCode = input.nextInt();
                        input.nextLine();

                        user.Devolver(choiceCode);
                    }

                    catch(Exception IndexOutOfBoundsException){
                        System.out.println("Livro incorreto");
                    }

                    System.out.print("\033\143");

                    break;

                case 3: //Logout
                    user = null;
                    menu = false;
                    break;
            }
            
        }
    }


    public void MenuAdmin(Bibliotecario admin , ArrayList<Livro> livros, ArrayList<Pessoa> users){

        boolean menuA = true;
        int choice;

        while(menuA) {

            do{
                System.out.println("----------------------------------------");
                System.out.println("\t MODO ADMINISTRADOR");
                System.out.println("----------------------------------------");
                System.out.println(
                "\t[1] Emprestar livro \n\t" 
                + "[2] Checar empréstimos de usuário\n\t"
                + "[3] Devolver livro \n\t"
                + "[4] Criar livro\n\t"
                + "[5] Logout ");
                System.out.println("----------------------------------------");
                System.out.print("--> ");
                choice = input.nextInt();
                input.nextLine();
                System.out.print("\033\143");

            } while(choice<0 || choice>5);

            switch(choice){

                case 1: //Realizar Empréstimo para cliente

                    Pessoa logUser = new Pessoa();
                    logUser = users.get(logUser.Login(users));

                    System.out.println("----------------------------------------");
                    System.out.println("\tRealizar Empréstimo");
                    System.out.println("----------------------------------------");
                    
                    System.out.print("--> ");
                    int choiceCode = input.nextInt();
                    input.nextLine();
                    System.out.print("\033\143");

                    if(choiceCode > (livros.size()-1)){
                        System.out.print("\033\143");
                        System.out.println("Livro inexistente");
                        break;
                    }

                    admin.Emprestar(livros, choiceCode, logUser);
                    logUser = null;

                    break;

                case 4://Criar livro

                    admin.newBook(livros);

                    break;

                case 5: //Logout
                    menuA = false;
                    break;
            }
            
        }
    }


    public void Recomendar(int[] generosHist, ArrayList<Livro> bookList) {


        Random rand = new Random();
        ArrayList<Livro> conjunto = new ArrayList<Livro>();
        Livro tempBook = new Livro();
        double recs;

        for (int i=0; i<generosHist.length; i++){


            if(generosHist[i] == 0){
                continue;
            }


            double soma = 0;

            for(int j=0; j<generosHist.length; j++){
                soma += generosHist[j]; 
            }

            recs = Math.round((generosHist[i]/soma) * 5.0);

            for(Livro b: bookList){

                if(b.getGenero() == i || b.getStatus())
                    conjunto.add(b);
            }


            for(int k=0; k<recs; k++){

                int n = rand.nextInt(conjunto.size());
                tempBook = conjunto.get(n);

                System.out.println("-> [" + tempBook.getCode() + "] " 
                + tempBook.getTitulo() + " - " + tempBook.getAutor());

                conjunto.remove(n);
            }

            conjunto.clear();
        }
    }
}