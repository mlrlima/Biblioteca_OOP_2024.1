

package biblioClasses;
import java.util.*;

public class Menu {

    
    transient Scanner input = new Scanner(System.in);

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
    
    public void MenuCliente(Pessoa user) {

        boolean menu = true;
        int choice;

        while(menu) {

            do{
                
                System.out.println("----------------------------------------");
                System.out.println("- Usuário: " + user.getNome());
                System.out.println("- Livros Emprestados: " + user.getEmprestados().size());
                System.out.println("----------------------------------------");
                System.out.println(
                "\t[1] Pegar livro emprestado \n\t" 
                + "[2] Checar empréstimos \n\t"
                + "[3] Devolução \n\t"
                + "[4] Logout ");
                System.out.println("----------------------------------------");
                System.out.print("--> ");
                choice = input.nextInt();
                input.nextLine();
                System.out.print("\033\143");

            } while(choice<0 || choice>4);

            switch(choice){

                case 1: //Pegar emprestado

                case 2:

                    System.out.println("\tLivros Emprestados:");

                    for(int i=1; i<=user.BorrowedList.size(); i++){

                        System.out.println(i+" - [" + i + "] " + 
                        user.BorrowedList.get(i).getTitulo() + " - " + 
                        user.BorrowedList.get(i).getAutor());
                    }

                    break;

                case 3: //Devolucao
                
                    //user.Devolver();

                    break;

                case 4: //Logout
                    user = null;
                    menu = false;
                    break;
            }
            
        }
    }

    //Fazer menu admin


}