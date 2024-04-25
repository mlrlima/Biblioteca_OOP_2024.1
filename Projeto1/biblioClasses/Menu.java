
//!!!AVALIAR SE A CLASSE MENU REALMENTE EH NECESSARIA!!!

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
    
    public void MenuCliente(Pessoa user) {

        boolean menu = true;
        int choice;

        while(menu) {

            do{
                
                System.out.println("----------------------------------------");
                System.out.println("- Usuário: " + user.getNome());
                System.out.println("----------------------------------------");
                System.out.println("\t[1] Pegar livro emprestado \n\t[2] Checar empréstimos \n\t[3] Devolução \n\t[4] Logout ");
                System.out.println("----------------------------------------");
                System.out.print("--> ");
                choice = input.nextInt();
                input.nextLine();
                System.out.print("\033\143");

            } while(choice<0 || choice>4);

            switch(choice){

                case 3: //Devolucao
                
                    user.Devolver();

                    break;

                case 4: //Logout
                    user = null;
                    menu = false;
                    break;
            }
            
        }
    }
}
