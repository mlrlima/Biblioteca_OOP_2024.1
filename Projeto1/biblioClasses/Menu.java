
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

        return choice;
    }
    
    public int MenuCliente(Pessoa user) {

        int choice;
        do{
            

            System.out.println("----------------------------------------");
            System.out.println("- Usuário: " + user.getNome());
            System.out.println("----------------------------------------");
            System.out.println("\t[1] Pegar livro emprestado \n\t[2] Checar empréstimos \n\t[3] Devolução \n\t[4] Encerrar ");
            System.out.println("----------------------------------------");
            System.out.print("--> ");
            choice = input.nextInt();
            input.nextLine();

        } while(choice<0 || choice>3);

        return choice;
    }
}
