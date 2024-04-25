import java.util.*;
import biblioClasses.*;
@SuppressWarnings("unused")

public class Biblioteca  {
    public static void main(String[] args) {
        
        //Array list de referencia aos objetos tipo Cliente
        ArrayList<Pessoa> userList = new ArrayList<>();

        
        Bibliotecario admin = new Bibliotecario();
        admin.setCPF("00000000000");
        admin.setSenha("12345678");
        userList.add(admin);
        

        //Array list de referencia aos CPFs existentes
        ArrayList<String> cpfList = new ArrayList<String>();

        //Array de livros disponíveis (fazer!)

        Menu myMenu = new Menu();

        while(true){

            switch( myMenu.Reception() ){

                case 1: //Login
                    
                    Cliente user = new Cliente();
                    int index = user.Login(userList);
                
                    if ( userList.get(index) instanceof Cliente){

                        //System.out.println(userList.get(index).getCPF());
                        //System.out.println(userList.get(index).getNome());

                        myMenu.MenuCliente(userList.get(index));

                    }

                    else{
                        System.out.println("Bem-vindo bibliotecario");
                    
                    }

                    break;

                case 2: //Nova Conta (Cliente)

                    Cliente novoCliente = new Cliente();

                    novoCliente.Registro(userList, cpfList);

                    break;

                case 3: //Encerrar
                    System.exit(0);

            }
        }
    }
}