
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
    


}
