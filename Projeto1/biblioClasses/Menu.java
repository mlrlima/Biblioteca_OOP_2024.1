

package biblioClasses;
import java.util.*;

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

                    System.out.println(" -> [" + i + "] " + 
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

                case 1: //Pegar emprestado

                    System.out.println("----------------------------------------");
                    System.out.println("\tRealizar Empréstimo");
                    System.out.println("----------------------------------------");
                    
                    System.out.print("--> ");
                    choiceCode = input.nextInt();
                    input.nextLine();
                    System.out.print("\033\143");

                    user.Emprestar(bookList, choiceCode);

                    break;


                case 2: //Devolucao
                
                    if(user.getEmprestados().size()==0){
                        System.out.println("Voce não possui livros emprestados.");
                        break;
                    }

                    System.out.println("\tLivros Emprestados:");

                    for(int i=0; i<user.BorrowedList.size(); i++){

                        System.out.println(" -> [" + i + "] " + 
                        user.BorrowedList.get(i).getTitulo() + " - " + 
                        user.BorrowedList.get(i).getAutor());
                    }

                    System.out.println("----------------------------------------");
                    System.out.println("\tDevolver");
                    System.out.println("----------------------------------------");
                    
                    System.out.print("--> ");
                    choiceCode = input.nextInt();
                    input.nextLine();
                    System.out.print("\033\143");

                    user.Devolver(choiceCode);

                    break;

                case 3: //Logout
                    user = null;
                    menu = false;
                    break;
            }
            
        }
    }


    public void MenuAdmin(Bibliotecario admin , 
    ArrayList<Livro> livros, 
    ArrayList<Pessoa> clients){

        boolean menu = true;
        int choice;

        while(menu) {

            do{
                
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

            } while(choice<0 || choice>4);

            switch(choice){

                case 1: //Pegar emprestado

                    break;

                case 2: //Checar emprestimos

                    break;

                case 3: //Devolucao
                
                    //user.Devolver();

                    break;

                case 4://Criar livro

                    admin.newBook(livros);
                    
                    break;

                case 5: //Logout
                    menu = false;
                    break;
            }
            
        }
    }
}