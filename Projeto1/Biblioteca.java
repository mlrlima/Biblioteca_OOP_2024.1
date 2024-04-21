import java.util.*;
import biblioClasses.*;
@SuppressWarnings("unused")

public class Biblioteca {
    public static void main(String[] args) {
        
        //Array list de referencia aos objetos tipo Cliente
        ArrayList<Pessoa> userList = new ArrayList<Pessoa>();

        //Array list de referencia aos CPFs existentes
        ArrayList<String> cpfList = new ArrayList<String>();

        //Array de livros disponíveis (fazer!)

        while(true){

            Menu myMenu = new Menu();

            switch( myMenu.Reception() ){

                //case 1:   Pessoa user = new Pessoa();   switch(user.Login())  --> admin ou cliente

                case 2: //Nova Conta

                Cliente novoCliente = new Cliente();

                novoCliente.Registro(userList, cpfList);

                case 3: //Encerrar
                    System.exit(0);
            }
        }
    }
}